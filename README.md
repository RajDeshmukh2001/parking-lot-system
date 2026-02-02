# SmartPark- Parking Lot System

## Problem statement:

1. The Goal:
Design and implement a Command Line Interface (CLI) based Parking Lot system. The system must manage a multi-floor parking facility, handle different vehicle types, assign spots intelligently, and calculate parking fees upon exit.

Constraint: Do not use a Database. Use in-memory data structures (Lists, Maps, Sets).
Focus: Object-Oriented Design (OOD), Clean Code, and Git Collaboration.

2. The Problem Scenario:
A parking lot has multiple floors. Each floor has a specific capacity of slots. The system needs to support:
Initialization: Create a parking lot with N floors and M slots per floor.
Vehicle Types: Support Trucks, Cars, and Bikes.
Spot Types:
Trucks can only park in large spots.
Bikes can park in small spots.
Cars can park in Medium or Large spots.
Parking Strategy: When a vehicle enters, assign the first available spot starting from Floor 1.
Unparking: When a vehicle leaves, release the spot and calculate the fee.
(SMALL:100,MEDIUM:150,LARGE:200) PER HOUR NEED TO BE DYNAMIC

## Requirements

### 1. Interface
- Command Line Interface (CLI)
- Single user manages one parking lot

### 2. Parking Lot Structure
- Multi-floor parking lot
- Configurable number of floors (N)
- Configurable number of slots per floor (M)
- Slot sizes:
  - Small (S)
  - Medium (M)
  - Large (L)

### 3. Vehicle Types
- Bike → Slot Type: Small (S)
- Car → Slot Type: Medium (M), Large (L)
- Truck → Slot Type: Large (L)

### 4. Parking Rules
- First Come First Serve (FCFS)
- Parking starts from Floor 1 and proceeds upward
- First available compatible slot is assigned

### 5. Vehicle Exit
- Slot is freed when vehicle leaves
- Parking fee is calculated on exit

### 6. Fees (per hour)
- Small (S): 100
- Medium (M): 150
- Large (L): 200

### 7. Core Actors
- Vehicle
- Slot
- Parking Lot

## Entities
- Vehicle
- Slot

### 8. Scope
- One user manages one parking lot

## Language
- Java (JDK 17 LTS or later)

## How to run the program
1. Clone the repository:
  ```bash
  git clone https://github.com/RajDeshmukh2001/parking-lot-system.git
  ```
2. Navigate to the project directory:
  ```bash
  cd parking-lot-system
  ```
3. Compile the project:
  ```bash
  javac *.java
  ```
4. Run the `Main` class:
  ```bash
  java  Main
  ```
5. Follow the CLI instructions.

## Usage Instructions
### Parking Vehicle

- Select option `1` for Parking
-  Choose a vehicle type (Bike, Car, or Truck)
- If a compatible slot is available, enter the vehicle registration number
- Your vehicle will be parked and assigned a spot
- To exit, select the unparking option and enter your registration number to pay the fee

## Branching strategy:
- GitHub Flow Strategy (main branch and feature branches)