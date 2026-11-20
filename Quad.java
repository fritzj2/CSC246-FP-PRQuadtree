class Point {
    int x, y;
    Point(int _x, int _y){
        x = _x;
        y = _y;
    }
    Point (){
        x = 0;
        y = 0;
    }
}

class Node {
    Point pos;
    String target;
    
    Node(Point position, String person){
        pos = position;
        target = person;
    }
    Node (){
        target = "";
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
    public Quad() { // Default constructor
        topLeft = new Point(0,0);
        botRight = new Point(0, 0);
        root = null;
        topLeftTree = null;
        topRightTree = null;
        botLeftTree = null;
        botRightTree = null;
    }
    public Quad(Point topL, Point botR) { // If Parameters
        root = null;
        topLeftTree = null;
        topRightTree = null;
        botLeftTree = null;
        botRightTree = null;
        topLeft = topL;
        botRight = botR;
    }
    public boolean inBoundary(Point p) {
        if ((p.x >= topLeft.x && p.x <= botRight.x) &&
            (p.y >= botRight.y && p.y <= topLeft.y)) {
            return true;
        }
        return false;
    }
}