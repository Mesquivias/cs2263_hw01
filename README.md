# cs2263_hw01
Homework #2 for CS2263 

//Note that I accidentally named everything hw01 instead of hw02, I apologize for that slipping by me. 



##Description
Homework to help gain familiarity with Git, Github, GitFlow, and Gradle.
Simple calculator that will either ask user for and equation and evaluate it or read and evaluate equations from a batch file. 
This was challenging for me to accomplish because the tools that we were using were foreign to me.

##Usage
In order to display the help table, while in the terminal you would have to input:

$ gradle run --args="-h"

Or:

$ gradle run --args="--help"

In order to run the program normally, inputting equations while being prompted if you want to input one more. 

$ gradle run

For the previous command, you will be promped to enter an equation (ex: 1+5+2+5) and it will print the result to the console.
The user will then be asked if they want to enter another equation and they must enter either a "1" for yes or a "0" for no. 


In order to evaluate equations from a batch file:

$ gradle run --args="-b test.txt" 

Or: 

$ gradle run --args="--batch test.txt"

Modify the test.txt file to have multiple lines of equations if you so desire. 

In order to output your console results to a .txt file alonside the console output:

$ gradle run --args="-o output.txt"

Or: 

$ gradle run --args="--output output.txt"

This option will prompt the user for equations similarly to 'gradle run' except the output.txt file should contain your equation inputs and answers as well as the console.



##Credits
Michael Esquivias








