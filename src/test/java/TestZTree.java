import com.milu.crm.pojo.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xu on 2017/2/15.
 */
public class TestZTree {
    public static void main(String[] args) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        list.add(new TreeNode("1","0","随意勾选 1",false,false,false));
        list.add(new TreeNode("11","1","随意勾选 1-1",true,false,false));
        list.add(new TreeNode("111","11","无 checkbox 1-1-1",false,true,false));
        list.add(new TreeNode("112","11","随意勾选 1-1-2",false,false,true));
        list.add(new TreeNode("12","1","无 checkbox 1-2",true,true,false));
        list.add(new TreeNode("121","12","无 checkbox 1-2-1",false,true,false));
        list.add(new TreeNode("122","12","无 checkbox 1-2-2",false,true,false));
        //上一层都不能nocheck,open的话，那子层肯定也不能open和check了，所以父层要设置false,如果设置true，那子层设置就没意义
        list.add(new TreeNode("2","0","随意勾选 2",true,false,false));
        list.add(new TreeNode("21","2","随意勾选 2-1",false,false,false));
        list.add(new TreeNode("22","2","随意勾选 2-2",false,false,false));
        list.add(new TreeNode("221","22","随意勾选 2-2-1",false,false,false));
        list.add(new TreeNode("222","22","随意勾选 2-2-2",false,false,false));
        list.add(new TreeNode("23","2","随意勾选 2-3",false,false,false));
        System.out.println(list.toString());
    }
}
