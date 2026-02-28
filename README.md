# Automated Waste Management System

This repository contains a Java implementation of an **Automated Waste Management System** designed using the **Chain of Responsibility** behavioral design pattern. 

## Problem Statement

Municipalities and cities face significant challenges in managing and efficiently disposing of waste. Traditional waste collection methods often result in delays, inefficiencies, and high operational costs. An innovative solution is needed to automate the waste management process, ensuring timely collection and disposal while optimizing resource utilization.

**Objective:** Develop an automated waste management system that uses a Chain of Responsibility pattern to ensure efficient waste collection and disposal. The system handles different types of waste containers (Organic, Recyclable, Hazardous) and triggers appropriate disposal actions based on the specific type and capacity status of each container.

---

## System Architecture 

This system leverages the **Chain of Responsibility** design pattern to decouple the sender of a waste collection request from its receivers. 

### Elements of the Pattern Used:
* **Request (`WasteContainer`):** Represents the bin needing disposal, containing data about the waste type, capacity, and whether it is full.
* **Handler Interface (`WasteCollectionChain`):** Defines the standard methods (`setNextChain` and `collect`) for all waste handlers.
* **Concrete Handlers:**
* * `OrganicWasteHandler`
  * `RecyclableWasteHandler`
  * `HazardousWasteHandler`
  Each handler checks if the container matches its specific waste type and is full. If not, it passes the request to the next handler in the chain.
* **Client / Context (`WasteManagementChain` & `WasteManagementSystemApp`):** Initializes the sequence of handlers and initiates the collection request.

### UML Diagram


<img width="5413" height="3797" alt="NLR (20)" src="https://github.com/user-attachments/assets/935ac7d7-7fff-4e4d-ac5e-3ae6b50cbce4" />
