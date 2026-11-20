 public class javasolution {
    private Node search (Quad n, Point p) {
        if (!n.inBoundary(p)) {
            return new Node();
        }
        if (n.root != null) {
            return n.root;
        }
        if ((n.topLeft.x + n.botRight.x) / 2 > p.y) {
            if ((n.topLeft.y + n.botRight.y) / 2 >= p.y) {
                // Indicates the topLeftTree
                if (n.topLeftTree == null){ return null;}
                return search(n.topLeftTree, p);
            }
            else{
                if (n.botLeftTree == null) {return null;}
                return search(n.botLeftTree, p);
            } // Bottom Left
        }
        else {
            if ((n.topLeft.y + n.botRight.y) / 2 >= p.y) {
                if (n.topRightTree == null) {return null;}
                return search(n.topRightTree, p);
            }
            else{
                if (n.botRightTree == null) {return null;}
                return search(n.botRightTree, p);
            }
        }

    }
}
