package god.soon.matender.service;

import god.soon.matender.entity.BoardEntity;
import god.soon.matender.repository.BoardRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

}
