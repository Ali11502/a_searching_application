**Search Engine Application**

**Overview:**
This Java application implements a basic search engine that indexes URLs based on words. It consists of several classes working together: `SearchEngine`, `WordLinkedList`, `WordNode`, `UrlList`, and `UrlNode`. The application prompts users to input a word, then searches for URLs associated with that word in a linked list data structure.

**Flow of Application:**

1. **Main Class (`SearchEngine`):**
   - Initializes a `WordLinkedList`.
   - Inserts sample word-url pairs into the `WordLinkedList`.
   - Prompts the user to input a word.
   - Passes the input word to the `WordLinkedList` for searching.
   - Displays the URLs associated with the input word.

2. **WordLinkedList:**
   - Manages a list of `WordNode` objects.
   - Initializes an array of `WordLinkedLists`, one for each alphabet letter.
   - Inserts words and URLs into the appropriate `WordLinkedList` based on the first letter of the word.
   - Searches for words and retrieves associated URLs.
   - Deletes words and their associated URLs.

3. **WordNode:**
   - Represents a node in the linked list of words.
   - Contains a `WordList` object to manage associated URLs.

4. **UrlList:**
   - Manages a list of `UrlNode` objects.
   - Inserts URLs into the list.
   - Displays the list of URLs.

5. **UrlNode:**
   - Represents a node in the linked list of URLs.

**Input and Output Format:**
- **Input:** Users input a single word through the console.
- **Output:** 
  - If the word exists in the index, the application displays the associated URLs.
  - If the word does not exist, it prompts "no search results".
  - Upon deletion of a word, it returns "no such word".

**Sample Interaction:**

```
Enter word: peshawar
for word: peshawar we have these urls
wiki.com
Peshawar_university.com
Pesh_university.com
End of search

Enter word: karachi
for word: karachi we have these urls
ttt.pk
dpdkd.com
End of search

Enter word: lahore
no search results
```