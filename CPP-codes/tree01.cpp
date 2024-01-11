#include <iostream>
using namespace std;

// Tree node structure
struct TreeNode 
{
    int data;
    TreeNode* left;
    TreeNode* right;

    // Constructor
    TreeNode(int value) 
    {
        data = value;
        left = NULL;
        right = NULL;
    }
};

// Function to insert a new node in the binary tree
void insertNode(TreeNode*& root, int value) 
{
    // If the tree is empty, create a new node and set it as the root
    if (root == NULL) 
    {
        root = new TreeNode(value);
        return;
    }

    // If the value is less than the root's data, recursively insert it in the left subtree
    if (value < root->data) 
    {
        insertNode(root->left, value);
    }
    // If the value is greater than or equal to the root's data, recursively insert it in the right subtree
    else 
    {
        insertNode(root->right, value);
    }
}

// Function to perform preorder traversal of the binary tree (root, left, right)
void preorderTraversal(TreeNode* root) 
{
    if (root == NULL) 
    {
        return;
    }

    cout << "Preorder data--> " << root->data << " "<<endl;
    preorderTraversal(root->left);
    preorderTraversal(root->right);
}

// Function to perform inorder traversal of the binary tree (left, root, right)
void inorderTraversal(TreeNode* root) 
{
    if (root == NULL) 
    {
        return;
    }

    inorderTraversal(root->left);
    cout << "Inorder data--> " << root->data << " "<<endl;
    inorderTraversal(root->right);
}

// Function to perform postorder traversal of the binary tree (left, right, root)
void postorderTraversal(TreeNode* root) 
{
    if (root == NULL) 
    {
        return;
    }

    postorderTraversal(root->left);
    postorderTraversal(root->right);
    cout << "Postorder data--> " << root->data << " "<<endl;
}

// Function to display all traversals of the binary tree
void display(TreeNode* root)
{
    cout << "Preorder Traversal: "<<endl;
    preorderTraversal(root);
    cout << endl;

    cout << "Inorder Traversal: "<<endl;
    inorderTraversal(root);
    cout << endl;

    cout << "Postorder Traversal: "<<endl;
    postorderTraversal(root);
    cout << endl;
}


// Function to find the node with the minimum value in a subtree
TreeNode* findMinValueNode(TreeNode* node)
{
    TreeNode* current = node;
    while (current && current->left != NULL)
    {
        current = current->left;
    }
    return current;
}

// Function to delete a node with a specific value from the binary tree
TreeNode* deleteNode(TreeNode* root, int value)
{
    if (root == NULL)
    {
        return NULL;
    }

    // If the value is less than the root's data, recursively delete it from the left subtree
    if (value < root->data)
    {
        root->left = deleteNode(root->left, value);
    }
    // If the value is greater than the root's data, recursively delete it from the right subtree
    else if (value > root->data)
    {
        root->right = deleteNode(root->right, value);
    }
    // If the value is equal to the root's data, delete the current node
    else
    {
        // Case 1: Node with no children
        if (root->left == NULL && root->right == NULL)
        {
            delete root;
            root = NULL;
        }
        // Case 2: Node with only one child
        else if (root->left == NULL)
        {
            TreeNode* temp = root;
            root = root->right;
            delete temp;
        }
        else if (root->right == NULL)
        {
            TreeNode* temp = root;
            root = root->left;
            delete temp;
        }
        // Case 3: Node with two children
        else
        {
            TreeNode* minValueNode = findMinValueNode(root->right);
            root->data = minValueNode->data;
            root->right = deleteNode(root->right, minValueNode->data);
        }
    }

    return root;
}


// Function to search for a specific element in the binary tree
bool searchElement(TreeNode* root, int value)
{
    if (root == NULL)
    {
        return false;
    }

    if (root->data == value)
    {
        return true;
    }
    else if (value < root->data)
    {
        return searchElement(root->left, value);
    }
    else
    {
        return searchElement(root->right, value);
    }
}

int main() 
{
    TreeNode* root = NULL;

    // Inserting nodes into the binary tree
    insertNode(root, 10);
    insertNode(root, 5);
    insertNode(root, 15);
    insertNode(root, 3);
    insertNode(root, 7);
    cout<<"Displaying the data of tree in traversal methods-->"<<endl;
    // Display all traversals of the binary tree
    display(root);
    
    root = deleteNode(root, 7);
    
    // now let's display data after deleting the 7 from the tree
    cout<<"After deleting of data -->"<<endl;
    display(root);
    int searchValue = 3;
    if (searchElement(root, searchValue))
    {
        cout << "Element " << searchValue << " found in the binary tree." << endl;
    }
    else
    {
        cout << "Element " << searchValue << " not found in the binary tree." << endl;
    }

    return 0;
}

