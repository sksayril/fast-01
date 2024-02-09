package y1;

public interface b {

    public interface a<T> {
        T a();
    }

    <T> T g(a<T> aVar);
}
