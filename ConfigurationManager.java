import java.util.HashMap;
import java.util.Map;

class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> configSettings;

    private ConfigurationManager() {
        configSettings = new HashMap<>();
        configSettings.put("maxPlayers", "100");
        configSettings.put("defaultLanguage", "en");
        configSettings.put("gameDifficulty", "medium");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return configSettings.getOrDefault(key, "Not Found");
    }

    public void printAllConfigs() {
        for (Map.Entry<String, String> entry : configSettings.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("maxPlayers: " + configManager.getConfig("maxPlayers"));
        configManager.printAllConfigs();
    }
}

interface ChatService {
    void sendMessage(String message);
}

class LegacyChatService {
    public void legacySendMessage(String msg) {
        System.out.println("Legacy Chat: " + msg);
    }
}

class ChatServiceAdapter implements ChatService {
    private LegacyChatService legacyChatService;

    public ChatServiceAdapter(LegacyChatService legacyChatService) {
        this.legacyChatService = legacyChatService;
    }

    @Override
    public void sendMessage(String message) {
        legacyChatService.legacySendMessage(message);
    }
}

class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService legacyService = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyService);
        chatService.sendMessage("Hello world!");
    }
}

