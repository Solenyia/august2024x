package org.example.World;

public class Oak extends Plant {
    public Oak() {
        // nebude fungovat -- type is private
        // type = "tree";

        // Toto funguje pretoze size v Plant je protected (Oak je subclassa Plant)
        this.size = "large";

        // No access specifier; works because Oak and Plant are in the same package
        this.height = 10;


    }

}
