// исключение в связи с ошибками переполнения очереди
class QueueFullException extends Exception {
	int size;
	
	QueueFullException(int s) {size = s;}
	
	public String toString() {
		return "\nQueue is full. Maximum size is "
 + size;	}
}

// исключение в связи с ошибками опустошения очереди
class QueueEmptyException extends Exception {
	public String toString() {
		return "\nQueue is empty";
	}
}
