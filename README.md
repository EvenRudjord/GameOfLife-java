# Game of Life - Java

## Description

This is a Java implementation of **Conway's Game of Life**, a cellular automaton created by mathematician John Conway. The Game of Life simulates the evolution of cells on a grid based on a set of simple rules. Each cell can either be alive or dead, and its future state is determined by the number of live neighbors it has.

This project allows you to explore how the state of the grid evolves from generation to generation.

## Rules

The Game of Life is governed by four simple rules:

1. **Any live cell with fewer than two live neighbors dies (underpopulation).**
2. **Any live cell with two or three live neighbors lives on to the next generation.**
3. **Any live cell with more than three live neighbors dies (overpopulation).**
4. **Any dead cell with exactly three live neighbors becomes a live cell (reproduction).**

## Overview

This project consists of four main classes:

1. **Celle**: Represents a single cell in the grid, storing its status (alive or dead), its neighbors, and methods to update and check its state.
2. **Rutenett**: Represents the grid (or "board") containing cells. It manages the cells, updates their states, and connects neighboring cells.
3. **Verden**: Represents the world where the grid exists. It runs the simulation, updating the grid generation by generation, and provides methods for printing the grid to the console.
4. **Main**: This is where the program starts. It initializes the grid and runs the simulation based on user input.

## How to Run

1. **Clone the repository**:
   If you don't have Git installed, download it [here](https://git-scm.com/).

   Clone the project to your local machine using:
   ```bash
   git clone https://github.com/yourusername/GameOfLife.git
