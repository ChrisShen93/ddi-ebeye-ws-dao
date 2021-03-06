package uk.ac.ebi.ddi.ebe.ws.dao.model.dataset;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import uk.ac.ebi.ddi.ebe.ws.dao.model.common.Entry;

/**
 * @author Yasset Perez-Riverol (ypriverol@gmail.com)
 * @date 12/05/2015
 */

@JsonIgnoreProperties(ignoreUnknown = true)

public class SimilarResult {

    @JsonProperty("entries")
    Entry[] entries;

    public Entry[] getEntries() {
        return entries;
    }

    public void setEntries(Entry[] entries) {
        this.entries = entries;
    }
}
