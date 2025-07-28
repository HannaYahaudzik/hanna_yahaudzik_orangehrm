package eu.senla.pages.auth.admin.job;

import eu.senla.customWebElements.table.Table;

public class JobTitleTable extends Table {

    public final JobTitlesTableCard getRow(final String name) {
        return new JobTitlesTableCard(name);
    }
}
