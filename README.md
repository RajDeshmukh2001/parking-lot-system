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