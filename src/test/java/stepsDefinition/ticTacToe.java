package stepsDefinition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

import java.util.ArrayList;
import java.util.List;

public class ticTacToe {

    public List<List<String>> board;

    @Given("^a board like this:$")
    public void aBoardLikeThis(DataTable table) {
        this.board = new ArrayList<List<String>>();
        for (List<String> row : table.raw()) {
            this.board.add(new ArrayList<String>(row));
        }

    }

    @When("^player \"([^\"]*)\" plays in row (\\d+), column (\\d+)$")
    public void playerXPlaysInRowColumn(String value, int row, int col) {
        board.get(row).set(col, value);
    }

    @Then("^the board should look like this:$")
    public void theBoardShouldLookLikeThis(DataTable expectedTable) {
        expectedTable.diff(board);

    }

}
