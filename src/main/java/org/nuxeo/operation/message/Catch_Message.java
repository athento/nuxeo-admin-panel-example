package org.nuxeo.operation.message;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

@Name("catch_Message")
@Scope(ScopeType.CONVERSATION)
public class Catch_Message {
	
	private String input;
	private String output;

	public void submit() {
		// handle form submission
		output = "Caught message: " + input;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
}