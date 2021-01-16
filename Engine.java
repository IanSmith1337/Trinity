public class Engine {
    private int difficulty;

    Engine(int difficulty) {
        this.difficulty = difficulty;
	}

	public void list() {
		String out = "name";
		System.out.print(out);
		out = "get_version";
		System.out.print(out);
		out = "protocol_version";
		System.out.print(out);
		out = "list_commands";
		System.out.print(out);
		System.out.println("\n");
	}


	public String getVersion() {
		return "0.1 alpha";
	}


	public String getName() {
		return "Trinity";
	}


	public int getProtocolVersion() {
		return 2;
	}
}
