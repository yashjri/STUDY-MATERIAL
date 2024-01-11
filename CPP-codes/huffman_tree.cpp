#include <iostream>
#include <map>
#include <queue>
using namespace std;

// Tree node structure
struct TreeNode
{
    char data;
    TreeNode* left;
    TreeNode* right;

    // Constructor
    TreeNode(char value)
    {
        data = value;
        left = NULL;
        right = NULL;
    }
};

// Custom comparison struct for priority queue
struct Compare
{
    bool operator()(TreeNode* a, TreeNode* b)
    {
        return a->data > b->data;
    }
};

// Function to build the Huffman tree
TreeNode* buildHuffmanTree(const map<char, int>& frequencies)
{
    // Create a priority queue (min heap) of tree nodes
    priority_queue<TreeNode*, vector<TreeNode*>, Compare> pq;

    // Create leaf nodes for each character and add them to the priority queue
    for (map<char, int>::const_iterator it = frequencies.begin(); it != frequencies.end(); ++it)
    {
        char character = it->first;
        int frequency = it->second;
        pq.push(new TreeNode(character));
    }

    // Build the Huffman tree by combining nodes from the priority queue
    while (pq.size() > 1)
    {
        TreeNode* left = pq.top();
        pq.pop();

        TreeNode* right = pq.top();
        pq.pop();

        TreeNode* newNode = new TreeNode('#');
        newNode->left = left;
        newNode->right = right;
        pq.push(newNode);
    }

    // Return the root of the Huffman tree
    return pq.top();
}

// Function to generate Huffman codes for each character
void generateHuffmanCodes(TreeNode* root, string code, map<char, string>& codes)
{
    if (root == NULL)
        return;

    if (root->left == NULL && root->right == NULL)
    {
        codes[root->data] = code;
        return;
    }

    generateHuffmanCodes(root->left, code + '0', codes);
    generateHuffmanCodes(root->right, code + '1', codes);
}

// Function to compress a string using Huffman codes
string compressString(const string& input, const map<char, string>& codes)
{
    string compressedString;

    // Replace each character with its corresponding Huffman code
    for (size_t i = 0; i < input.length(); ++i)
    {
        compressedString += codes.find(input[i])->second;
    }

    return compressedString;
}

// Function to decompress a string using Huffman codes
string decompressString(const string& compressedString, TreeNode* root)
{
    string decompressedString;

    TreeNode* currentNode = root;
    for (size_t i = 0; i < compressedString.length(); ++i)
    {
        if (compressedString[i] == '0')
        {
            currentNode = currentNode->left;
        }
        else if (compressedString[i] == '1')
        {
            currentNode = currentNode->right;
        }

        if (currentNode->left == NULL && currentNode->right == NULL)
        {
            decompressedString += currentNode->data;
            currentNode = root;
        }
    }

    return decompressedString;
}

int main()
{
    string input = "Huffman algorithm example";

    // Step 1: Count the frequency of each character in the input string
    map<char, int> frequencies;
    for (size_t i = 0; i < input.length(); ++i)
    {
        char c = input[i];
        frequencies[c]++;
    }

    // Step 2: Build the Huffman tree
    TreeNode* root = buildHuffmanTree(frequencies);

    // Step 3: Generate Huffman codes for each character
    map<char, string> codes;
    generateHuffmanCodes(root, "", codes);

    // Step 4: Compress the input string using Huffman codes
    string compressedString = compressString(input, codes);

    // Step 5: Decompress the compressed string using Huffman codes
    string decompressedString = decompressString(compressedString, root);

    // Output
    cout << "Input string: " << input << endl;
    cout << "Compressed string: " << compressedString << endl;
    cout << "Decompressed string: " << decompressedString << endl;

    return 0;
}

