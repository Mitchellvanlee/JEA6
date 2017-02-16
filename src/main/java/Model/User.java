package Model;

import Model.Message;

import java.util.List;

/**
 * Created by Mitchell on 16-2-2017.
 */
public class User {

    //Lijst met mijn berichten
    private List<Message> myMessageList;
    //Lijst met volgers
    private List<User> myFollowers;
    //Lijst met mensen die door mij worden gevolgd
    private List<User> amFollowing;

    public User()
    {
    }

    public List<Message> getMyMessageList()
    {
        return this.myMessageList;
    }

    public void addFollower(User newFollower)
    {
        this.myFollowers.add(newFollower);
    }

    public void removeFollower(User oldFollower)
    {
        this.myFollowers.remove(oldFollower);
    }

    public void iWantToFollow(User newFollower)
    {
        this.amFollowing.add(newFollower);
    }

    public void iDontWantToFollow(User oldFollower)
    {
        this.amFollowing.remove(oldFollower);
    }
}
