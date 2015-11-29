package aydoo.edu.tp;

public class ParseJson implements Parser {

	private InputEntity inputEntity;

	public ParseJson(InputEntity inputEntity) {
		this.inputEntity = inputEntity;
	}

	@Override
	public String parse() {
		return getInputEntity().toString();
	}

	public InputEntity getInputEntity() {
		return inputEntity;
	}
}