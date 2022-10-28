public class Author {
    private String fullName;

    public Author(String fullName){
        this.fullName = fullName;
    }

    public String getFullName(){
        return fullName;
    }

    public String toString(){
     return "‘»Œ: " + fullName;
    }

    @Override
    public boolean equals(Object object){
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()){
            return false;
        }
        Author author = (Author) object;
        return fullName.equals(author.fullName);
    }

    @Override
    public int hashCode(){
        int result = fullName == null ? 0 : fullName.hashCode();
        return result;
    }
}

