# jZhouMettleEval

Hi! I'm Jake Zhou and this is my implementation for the following coding challenge:

> You are given a 0-indexed integer array nums and a target element target. 
> A target index is an index i such that nums[i] == target.
> Return a list of the target indices of nums after sorting nums in non-decreasing order. 
> If there are no target indices, return an empty list. 
> The returned list must be sorted in increasing order.


## Building and Testing

The implementation comes with 7 unit tests that are ran during compile time. 
The implemented function can be found in *src.java.main.org.example.Main.getIndices()*.

To build the project on your local device, please download this repository to your local system and run the following Maven command in the project root directory (...\jZhouMettleEval):
`mvn clean install`

Additionally the unit tests can be reran after building using the following Maven command:
`mvn test`

### sampleTest1 / sampleTest2
These two unit tests found in the *src.test.java.org.example.MainTest* class cover the basic usage of getIndices(). The target values are within the input arrays.

### targetFirstTest / targetLastTest
These two unit tests are similar to sampleTest1 and sampleTest2 but cover the use case when the target values are either the smallest or largest value in the input array.

### emptyInputTest
This unit test covers the use case when the input array is empty. The expected output is an empty output array.

### missingTargetTest
This unit test covers the use case when the target value is not present in the input array. The expected output is an empty output array.

### fullInputTargetTest
This unit test covers the use case when the input array is only composed of the target value. The expected output is an array of all indices in the input array in the range of [0, n-1] where n is the number of input array values.

## Assumptions Made
The function assumes that a valid integer input array and a valid integer target value is inputted to the function. This means that a **non-NULL** input array is required. Inputting a null value would cause an uncaught exception in getIndices(). It is assumed that the calling function of getIndices() would confirm that the right data types were used for the input array and target value as well as confirm that the input array is not null.

Please note that print statements were added to the function to standard out for your convenience. You can view the test input array, target value, and output array during testing. 
For a more complex project, we would use a more comprehensive logging tool such as Apache's log4j instead. This comes with additional configuration requirements but allows us to direct logging messages to different severity levels as well as to different output locations.

