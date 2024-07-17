package projectGame;

public interface Action {
    void attack(Character target);
    void defend();
    void flee();
}