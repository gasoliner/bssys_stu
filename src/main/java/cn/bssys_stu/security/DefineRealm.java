package cn.bssys_stu.security;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;


/**
 * Created by 万洪基 on 2017/7/5.
 */
public class DefineRealm extends AuthorizingRealm {

//    @Autowired
//    UserService userService;
//    @Autowired
//    RoleService roleService;

//    授权的验证
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        System.out.println("开始授予权限。。。。。。");
//        String username = (String)principalCollection.getPrimaryPrincipal();
//        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//
////        temp
//        BsUser user = userService.getUserByEmployenum(username);
//        Set<String> roleSet = new HashSet<>();
//        roleSet.add(user.getRoleidsstr());
//
//        authorizationInfo.setRoles(roleSet);
//        authorizationInfo.setStringPermissions(roleService.getPermissionByRid(Long.parseLong(user.getRoleidsstr())));
//
//        System.out.println(roleService.getPermissionByRid(Long.parseLong(user.getRoleidsstr())));
//
//        return authorizationInfo;
        return null;
    }

//    登录验证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        System.out.println("登录验证中。。。。。");
//        String username = (String) authenticationToken.getPrincipal();
//        BsUser user = userService.getUserByEmployenum(username);
//        if(user == null) {
//            throw new UnknownAccountException();//没找到帐号
//        }
//        if(Boolean.TRUE.equals(user.getLocked())) {
//            throw new LockedAccountException(); //帐号锁定
//        }
//        AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
//                user.getEmployeenum(),
//                user.getPassword(),
//                getName()
//        );
//        return authenticationInfo;
        return null;
    }
}
