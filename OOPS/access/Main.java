package OOPS.access;

/*
    ===========================
    All Theory About Access Modifiers in Java
    ===========================

    1. What are Access Modifiers?
    -----------------------------
    Access modifiers in Java are keywords used to set the accessibility (visibility) of classes, constructors, methods, and other members. They help implement encapsulation by controlling which parts of your code can be accessed from other parts.

    2. Types of Access Modifiers
    ----------------------------
    Java provides four main access modifiers:

    a) private
        - The member is accessible only within the same class.
        - Not visible to subclasses or other classes in the same package.
        - Most restrictive access level.
        Example:
            private int data;

    b) default (no modifier)
        - If no access modifier is specified, it is considered "package-private" or "default".
        - The member is accessible only within classes in the same package.
        Example:
            int data; // default access

    c) protected
        - The member is accessible within the same package and by subclasses (even if they are in different packages).
        Example:
            protected int data;

    d) public
        - The member is accessible from any other class.
        - Least restrictive access level.
        Example:
            public int data;

    3. Access Modifier Table
    ------------------------
    | Modifier   | Same Class | Same Package | Subclass (diff package) | Other Packages |
    |------------|------------|--------------|------------------------|----------------|
    | private    | Yes        | No           | No                     | No             |
    | default    | Yes        | Yes          | No                     | No             |
    | protected  | Yes        | Yes          | Yes                    | No             |
    | public     | Yes        | Yes          | Yes                    | Yes            |

    4. Access Modifiers for Classes
    -------------------------------
    - Top-level classes can only be public or default (package-private).
    - Inner classes can use all four access modifiers.

    5. Why Use Access Modifiers?
    ----------------------------
    - To implement encapsulation (hiding internal details).
    - To restrict access to sensitive data and methods.
    - To provide controlled interfaces for interacting with objects.

    6. Real-World Analogy
    ---------------------
    - Think of access modifiers like doors with different locks:
        - private: Only you have the key (your room).
        - default: Only people in your house (package) can enter.
        - protected: Family members (subclasses) and housemates (package) can enter.
        - public: Anyone can enter.

    7. Best Practices
    -----------------
    - Use the most restrictive access level that makes sense for a particular member.
    - Make fields private and provide public/protected getters and setters if needed.
    - Avoid public fields unless they are constants (static final).

    ===========================
    End of Access Modifiers Theory
    ===========================
*/

public class Main {

}
