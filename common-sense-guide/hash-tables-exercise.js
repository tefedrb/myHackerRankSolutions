/* 
    Write a function that returns the intersection of two arrays. The intersection is a third array that contains all values contained within 
    the first two arrays. For example, the intersection of [1,2,3,4,5] and [0,2,4,6,8] is [2,4]. 
    Your function should have a complexity of O(N). (If your programming language has a built-in way of doing this, don't use it. 
    The idea is to build the algorithm yourself). 
*/

const intersection = (arr1, arr2) => {
    const output = [];

    const toHash = arr1.reduce((acc, cur) => {
        if(!acc[cur]) acc[cur] = true;
        return acc;
    },{});

    for(let i = 0; i < arr2.length; i++){
        if(toHash[arr2[i]]){
            output.push(toHash[arr2[i]]);
        }
    }

    return output;
}

/* 
    Write a function that accepts an array of strings and returns the first duplicate value it finds. For example, if the array is 
    ["a", "b", "c", "d", "c", "e", "f"], the function should return "c", since it's duplicated within the array. (You can assume that
    there's one pair of duplicates within the array.) Make sure the function has an efficiency of O(N).
*/

const firstDuplicate = (arr) => {
    const hash = {};
    for(let i = 0; i < arr.length; i++){
        if(hash[arr[i]]) return arr[i];
        hash[arr[i]] = true;
    }
    return null;
}

/* 
    Write a function that accepts a string that contains all the letters of the alphabet except one and returns the missing letter. For example,
    the string, "the quick brown box jumps over a lazy dog" contains all the letters of the alphabet except the letter "f".
    The function should have a time complexity of O(N).
*/

const missingOneLetter = (str) => {
   const hash = {};
   for(let i = 0; i < str.length; i++){
       hash[str[i]] = true;
   }
   const alphabet = "abcdefghijklmnopqrstuvwxyz";
   for(let i = 0; i < alphabet.length; i++){
       if(!hash[alphabet[i]]) return alphabet[i];
   }
   return null;
}