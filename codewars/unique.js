// Given an array of integers, which contain several duplicates and one unique integer, write a function to find the unique integer.

const array = [5,5,5,3,2,2,1,1];

/* 
   1. Create object
   2. Iterate through array - each element will either be a new key with a value of 1 or add to the value of that key.
   3. Initialize output variable. Loop through obj and find the key with the value of one.
   4. In loop, save that key into output.
   5. Return output variable (optional: turn string into number). 
*/

const findUniqueInt = (arr) => {
  // Step 1:
 const hashTable = new Object();
  // Step 2:
 arr.forEach(cur => {
   hashTable[cur] ? 
   hashTable[cur]++ :
   hashTable[cur] = 1; 
 });
  // Step 3:
 let output = null;
 for(const key in hashTable){
   // Step 4:
   if(hashTable[key] == 1){
     output = key;
   }
 }
 // Step 5:
 return parseInt(output);
};

findUniqueInt(array);


