package com.milu.crm.pojo;

import java.io.Serializable;

/**
 * Created by xu on 2017/2/15.
 */
public class TreeNode implements Serializable {

        private static final long serialVersionUID = -766759489880382042L;

        private String id;
        private String pId;
        private String name;
        private boolean open;  //是否默认打开
        private boolean nocheck; //是否可以选
        private boolean checked; //是否默认选上

        public TreeNode() {
            super();
        }

        public TreeNode(String id, String pId, String name, boolean open, boolean nocheck, boolean checked) {
            super();
            this.id = id;
            this.pId = pId;
            this.name = name;
            this.open = open;
            this.nocheck = nocheck;
            this.checked = checked;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getpId() {
            return pId;
        }

        public void setpId(String pId) {
            this.pId = pId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isOpen() {
            return open;
        }

        public void setOpen(boolean open) {
            this.open = open;
        }

        public boolean isChecked() {
            return checked;
        }

        public void setChecked(boolean checked) {
            this.checked = checked;
        }

        public boolean isNocheck() {
            return nocheck;
        }

        public void setNocheck(boolean nocheck) {
            this.nocheck = nocheck;
        }

    @Override
    public String toString() {
        return "{id:" + id + ", pId:" + pId + ", name:'" + name + "', open:true}";
    }
}
