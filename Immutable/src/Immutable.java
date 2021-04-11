final class Immutable {
    private final String className;
    final int regNo;

    Immutable(String className, int regNo) {
        this.className = className;
        this.regNo = regNo;
    }

    String getClassName() {
        return className;
    }

    int getRegNo() {
        return regNo;
    }
}

class test {
    public static void main(String args[]) {
    Immutable im = new Immutable("Immutable",1);
        System.out.println(im.getClassName());
        System.out.println(im.getRegNo());
    }
}