package domain;

import javax.swing.text.View;

public class Post {
    private int id;
    // Личный идентификатор поста

    private int ownerId;
    //Личный идентификатор владельца поста

    private int dateAndTime;
    // Дата и время размещения

    private String name;
    //Заголовок

    private CommentsInfo commentsInfo;
    //Отдельный класс с информацией о комментариях (В документации тип object)

    private String picture;
    //Картинка-и

    private String attachments;
    // Вложенные медиа файлы

    private String text;
    // Текст

    private LikesInfo likesInfo;
    // Отдельный класс с информацией об отметках "Нравится"

    private RepostsInfo repostsInfo;
    // Отдельный класс с информацией о репостах записи

    private int fromId;
    // Идентификатор автора поста, от чьего имени опубликована запись

    private boolean replyOwner;
    //Наличие отметки об ответе на запись, на которую была поставлена эта

    private int replyOwnerId;
    //идентификатор автора записи, на которую была поставлена эта (Документация)

    private boolean friendsOnly;
    // Отметка о приватном размещении (Документация)

    private ViewsInfo viewsInfo;
    // Отдельный класс с информацией о просмотрах

    private boolean canPin;
    // Отметка, сможет ли текущий пользователь закрепить запись (Документация)

    private boolean canDelete;
    // Отметка, сможет ли текущий пользователь удалить запись (Документация)

    private boolean canEdit;
    // Отметка, сможет ли текущий пользователь редактировать запись (Документация)

    private boolean postPinned;
    // Отметка, что запись закреплена (Документация)

    private boolean markAsAdv;
    // Отметка о рекламной интеграции (Документация)

    private boolean adAsFavorite;

    // Отметка о добавлении в закладки у текущего пользователя (Документация)

    public void textComments(){
        CommentsInfo com = new CommentsInfo();
        String test = com.getText();
    }
    public void regComments(){
        CommentsInfo com = new CommentsInfo();
        boolean reg = com.getReg();
    }
    public void DataAndTimeComments(){
        CommentsInfo com = new CommentsInfo();
        int DataAndTime = com.getDataAndTime();
    }
    public void ownderIdComments(){
        CommentsInfo com = new CommentsInfo();
        int ownerId = com.getOwnerId();
    }
    public void countLikes(){
        LikesInfo like = new LikesInfo();
        int count = like.getCount();
    }
    public void ownerIdLikes(){
        LikesInfo like = new LikesInfo();
        int ownerId = like.getOwnerId();
    }
    public void dataAndTimeLikes(){
        LikesInfo like = new LikesInfo();
        int dataAndTime = like.getDataAndTime();
    }
    public void countViews(){
        ViewsInfo view = new ViewsInfo();
        int count = view.getCount();
    }
    public void viewerId(){
        ViewsInfo view = new ViewsInfo();
        int viewerId = view.getViewersId();
    }
    public void countOfRepost(){
        RepostsInfo rep = new RepostsInfo();
        int countOfRepost = rep.getCountOfRepost();
    }
    public void reporterId(){
        RepostsInfo rep = new RepostsInfo();
        int reporterId = rep.getReporterId();
    }
    public void dataAndTimeOfReporter(){
        RepostsInfo rep = new RepostsInfo();
        int dataAndTimeOfReporter = rep.getDataAndTime();
    }

}
