class _08_SuperConstructor {
    String name;
    _08_SuperConstructor(String name){
        this.name = name;
    }
}

class vicePrecident extends _08_SuperConstructor{
    vicePrecident(String name){
        super(name);
    }
}
