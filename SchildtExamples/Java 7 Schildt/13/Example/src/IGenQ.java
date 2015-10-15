// Обобщенный интерфейс очереди
public interface IGenQ<T> {
	// поместить элемент в очередь
	void put(T ch) throws QueueFullException;
	
	// извлечь элемент из очереди
	T get() throws QueueEmptyException;
}
