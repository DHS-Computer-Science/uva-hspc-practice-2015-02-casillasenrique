# Practice 2015 - 02: Fury’s Graffiti

## Background
After the events of the first Avengers movie, Nick Fury got in trouble for
taking matters into his own hands. As punishment, he has to repaint and label
all the helicarriers in his fleet. However, his labelling equipment was damaged
in the fight with the Chitauri, and now it can only print round letters and
numbers. He needs help figuring out what labels he will be able to print on
his helicarriers.

Given a word or number, determine if the word or number is made up completely of
rounded letters and digits. A rounded letter is one that has a curve. For
example, ‘S’ is rounded, as is ‘5’, but ‘I’ and ‘T’ are not. All letters that
we are considering are upper-case letters.

For the purposes of this problem, the rounded letters are:
B, C, D, G, J, O, P, Q, R, S, and U.

The rounded digits are:
2, 3, 5, 6, 8, 9, and 0.

We realize that other letters may appear rounded when rendered with specific
fonts; however, the letters and digits listed here are the only rounded ones
as far as this problem is concerned.

## Description

### Input
The first line of the file will have an integer, n, which is the number of test
cases in this file.

Each of the following n lines will consist of one string. Each string will
only consist of alphanumeric characters (A-Z, 0-9). There will be no spaces
on each line. A test case could contain both letters and numbers, but only
capital letters will be used.

Each string will have at most 254 characters.

### Output
If the word or number is made up completely of rounded letters and numbers,
print ROUNDED followed by a new line. If there is a non-round letter of number,
print NOT ROUNDED followed by a new line. Please pay attention to case
in the output!

## Sample
### Input
```
5
GOOD
LUCK
AT
HSPC
2015
```

### Output
```
ROUNDED
NOT ROUNDED
NOT ROUNDED
NOT ROUNDED
NOT ROUNDED
```
