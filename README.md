# SOLID Exercises
After debuggin for several hours we cannot found some inconsistences in our program, you as a developer needs to identify those problems. You need to create unit test of our methods to identify the problems, but you cannot yet 'cause the previous developer don't follow any pattern and it's difficult to create test on it.

## Classes diagram
![Classes diagram](/img/UMLSOLIDExample.jpg?raw=true "Classes diagram")


## Inconsistencies
These are logs of our program and we see the following:

1. Our conductor had money but never rapaired the car
![inconsistencie_1](/img/inconsistencie1.png?raw=true "Inconsistencie 1")


2. Theoretically, the car was ruined but in the next iteration the conductor could perform the trip.

![inconsistencie_2](/img/inconsistencie2.png?raw=true "Inconsistencie 2")

3. "Repair car method" was never called.

![inconsistencie_3](/img/inconsistencie3.png?raw=true "Inconsistencie 3")

## Test cases
Once you have all the refactor of code done you need to verify that all code is working correctly with the following cases:
1. Create a car and assert that the reparation price of two FIRESTONE tires and two MICHELIN tires is 31,000
2. Create a car and verify all tires are working well without engine status.
3. Assert that tires aren't working well after 3 uses (3 calls to drive method)
4. Assert that driver can't perform a trip if the car is not working well.
5. Assert that the car won't be repair if the money is not enough.

## How it works?
Create a branch and try to solve these problems. Try to be creative, you can do anything as you think necessary.

You should to use at least:
 * SOLID principles
 
Optionally
 * Dagger 2
