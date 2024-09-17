# Car Traveling Around the Globe Animation

## Overview

This Android application showcases an animation of a car traveling around the globe with interactive elements such as rotating sun, moving clouds, and traffic lights. The app is developed using Android Studio and demonstrates various animation techniques and asset management.

## Features

- **Sun Animation:** The sun rotates infinitely around the Earth's center.
- **Cloud Movement:** Two clouds move across the screen with different translation durations.
- **Earth and Traffic Light:** The Earth remains stationary with a traffic light and rock positioned as specified.
- **Car Animation:** The car rotates around the globe, responds to traffic light changes, and interacts with the rock.

## Assets Required

- **Sun Image** (PNG with transparent background)
- **Cloud Image** (PNG with transparent background)
- **Planet Earth Image** (PNG with transparent background)
- **Car Image** (PNG with transparent background)
- **Rock Image** (PNG with transparent background)
- **Traffic Light Images** (3 states: Red, Orange, Green, PNG with transparent background)

## Animation Logic

1. **Sun Animation:**
   - The sun rotates in and out of the screen with Earth's center as the rotation center.
   - The rotation starts immediately and continues infinitely.

2. **Cloud Movement:**
   - Two cloud images move across the screen on the x-axis.
   - Cloud 1: Duration of 8 seconds.
   - Cloud 2: Duration of 16 seconds.
   - Clouds move infinitely and overlap with the sun based on their positions.

3. **Earth:**
   - The Earth remains stationary.
   - Traffic light at the top center and rock at the bottom center of the globe.
   - Traffic light cycles through red (3 seconds), orange (2 seconds), and green.

4. **Car Animation:**
   - Initially waits at a red traffic light, then turns to orange (3 seconds), and green (2 seconds).
   - Starts rotating around the globe clockwise with an initial speed `x`.
   - When the car touches the rock:
     - Speed reduces to `0.5x`.
     - The rock falls diagonally to the bottom-left corner and rotates 180 degrees.
   - The car continues rotating at `0.5x` speed and follows the traffic light cycle (red, orange, green) infinitely.
