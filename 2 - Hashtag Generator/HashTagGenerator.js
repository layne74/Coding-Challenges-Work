/**
 * Generates a hashtag from a given string, with optional capitalization retention.
 * First letter of each word is always capitalized.
 * 
 * @param {string} str - The input string to generate the hashtag from.
 * @param {boolean} [retainCapitalization=true] - Whether to retain capitalization in the generated hashtag.
 * @return {string|boolean} - The generated hashtag if it is >0 and <= 140 characters long, otherwise false.
 * @example generateHashtag('hello WORLD', true) // '#helloWORLD'
 * @example generateHashtag('hello WORLD', false) // '#HelloWorld'
 */
function generateHashtag(str, retainCapitalization = true) {
  const filteredStr = str.split(" ").filter((char) => char != "");
  const result = filteredStr
    .map(
      (word) =>
        word[0].toUpperCase() +
        (retainCapitalization ? word.slice(1) : word.slice(1).toLowerCase())
    )
    .join("");

  return result.length > 0 && result.length <= 140 ? `#${result}` : false;
}
