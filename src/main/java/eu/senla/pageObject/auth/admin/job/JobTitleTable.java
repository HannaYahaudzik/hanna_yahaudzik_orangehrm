package eu.senla.pageObject.auth.admin.job;

import eu.senla.webElement.table.Table;

public class JobTitleTable extends Table {

    public final JobTitlesTableCard getRow(final String name) {
        return new JobTitlesTableCard(name);
    }
}
