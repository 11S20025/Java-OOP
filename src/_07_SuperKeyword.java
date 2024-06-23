class _07_SuperKeyword {
    int getCorner(){
        return 4;
    }
}

class Rectangle extends _07_SuperKeyword{
    int getCorner(){
        return 0;
    }

    int getParentCorner(){
        return super.getCorner();
    }
}