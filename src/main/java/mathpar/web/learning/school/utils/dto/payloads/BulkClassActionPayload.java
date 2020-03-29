package mathpar.web.learning.school.utils.dto.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BulkClassActionPayload {
    private long classId;
    private List<Long> students;
}