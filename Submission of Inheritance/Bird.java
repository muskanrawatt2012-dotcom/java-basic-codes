class Bird { void fly() {} }
class Ostrich extends Bird { void fly() { throw new UnsupportedOperationException(); } } // violates LSP
