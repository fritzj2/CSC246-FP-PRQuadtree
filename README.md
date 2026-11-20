# CSC246-FP-PRQuadtree
This repository is built for the Berea College CSC 246 final project. This is a codewars problem that is built around the PRQuadtrees data structure.

# Hitmans Coordinate Tracker

## Authors

 - [Julius Fritz](https://github.com/fritzj2)
 - Dustan Webb (https://github.com/Dwebb28-CS)
 - Rafael Hermoza (https://github.com/RafaelHermoza)

## Project Statement

A hitman has a way to track its next targets. The hitmen need to have fast access to nodes and adding new people into the list. For this reason, the hitmen are using a Point Relation Quadtree (or PR-Quadtree) to store the information about each of their targets. They have to figure out how to remove one person (a node) from the given PR-Quadtree.

![sample image](sample-image.png "Sample Image")
 
## Examples

Given the tree: node -> [empty_node, node, empty_node, person], remove person
In this situation the tree would return: node -> [empty_node, node, empty_node, empty_node]

Given the tree: node -> [node, node, node, further_node] -> [empty, empty, person, removal], remove removal
In this sitution the tree would return node -> node -> [node, node, node, person] as the further_node is consolidated.

Given the tree: person, remove person
In this situation the function would return `Null` as there is no one left in the tree


### Example 1:

**Input:** `PrTreeNode root`, `PrTreeNode target`

**Output:** `PrTreeNode root_without_target`

**Explanation:** Using the coordinates present in the target, the root can be traversed to find the target Node.

## Constraints

- In order to delete a node, you must set the node itself to `Null`


### Topics

- pr quadtrees
- recursion
- trees
- tree node deletion

### Level

- medium

## Code (stub to show parameters, return type, and definitions)

```java
// put your Java stub code here
class Point {
    int x, y;
    Point(int _x, int _y){
        x = _x;
        y = _y;
    }
}

class Node {
    Point pos;
    String target;
    Node(Point position, String person){
        pos = position;
        target = person;
    }
}

public class Quad {
    Point topLeft;
    Point botRight;
    Node root;
    Quad topLeftTree;
    Quad topRightTree;
    Quad botLeftTree;
    Quad botRightTree;
}

class Solution {
    public Node delete_node(Node root, Node target) {
        // code here

    }
}
```

## Test cases

### Test Case 1

`node -> [empty_node, node, empty_node, person], remove person`

`target = person`

`return node -> [empty_node, node, empty_node, empty_node]`

## Solutions

- Include two (or more) solutions, one in Java and one in another language.
- Each **must** explain in detail how to run it (where it will run as presented.)
- The code must include all needed libraries and be well-documented with commenting.

[Java](javasolution.java)

[Python](pythonsolution.py)

[C++](cppsolution.cpp)

[complexity analysis](complexity.md)

## Video on (add project title here)

To deepen understanding of (add project topic here) see [Add title of Video here](Add full URL to video here)

## References (for all ideas not our own)

- [GeeksForGeeks]((https://www.geeksforgeeks.org/dsa/quad-tree/))

