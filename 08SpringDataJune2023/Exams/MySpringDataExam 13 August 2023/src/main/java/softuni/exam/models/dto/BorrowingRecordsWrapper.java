package softuni.exam.models.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "borrowing_records")
public class BorrowingRecordsWrapper {
    @XmlElement(name = "borrowing_record")
    List<BorrowingRecordsImportDTO> borrowingRecordImportDTOS;

    public List<BorrowingRecordsImportDTO> getBorrowingRecordsImportDTOS() {
        return borrowingRecordImportDTOS;
    }

    public void setBorrowingRecordsImportDTOS(List<BorrowingRecordsImportDTO> borrowingRecordsImportDTOS) {
        this.borrowingRecordImportDTOS = borrowingRecordsImportDTOS;
    }
}
