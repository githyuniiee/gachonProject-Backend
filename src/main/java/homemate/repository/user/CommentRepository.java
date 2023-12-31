package homemate.repository.user;
import homemate.domain.user.ArticleEntity;
import homemate.domain.user.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CommentRepository extends JpaRepository<CommentEntity,Long> {

    void deleteByArticle(ArticleEntity article);

}
