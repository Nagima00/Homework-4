# Homework-4
# README: Singleton and Adapter Patterns

## Overview
This project demonstrates the use of Singleton and Adapter design patterns:
- Singleton – The ConfigurationManager class ensures that only one instance is created and manages global configurations.
- Adapter – The ChatServiceAdapter adapts an old chat system to a new interface.

## Part 1: Singleton – Configuration Manager
### Description
The ConfigurationManager class follows the Singleton pattern, ensuring that only one instance exists throughout the application. It stores configuration settings and allows retrieval of values.

### Key Features
- Ensures a single instance (created only once)
- Stores and retrieves configuration values
- Prints all stored configurations


## Part 2: Adapter – Chat Service Adapter
### Description
The ChatServiceAdapter class adapts an old chat system to a modern interface.

### Key Features
- Implements the ChatService interface
- Converts the old system’s legacySendMessage() method to the new sendMessage() method

## File Structure
|-- ConfigurationManager.java
|-- ConfigManagerDemo.java
|-- LegacyChatService.java
|-- ChatService.java
|-- ChatServiceAdapter.java
|-- ChatAdapterDemo.java

## Additional Information
- ConfigurationManager is not optimized for multi-threading. If needed, consider using synchronized methods or double-checked locking.
- ChatServiceAdapter makes it easy to integrate old and new systems.

## Author
This project was created by Tasbalta Nagima.

