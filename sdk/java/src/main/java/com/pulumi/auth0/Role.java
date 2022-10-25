// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.RoleArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.RoleState;
import com.pulumi.auth0.outputs.RolePermission;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * With this resource, you can create and manage collections of permissions that can be assigned to users, which are otherwise known as roles. Permissions (scopes) are created on `auth0.ResourceServer`, then associated with roles and optionally, users using this resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.ResourceServer;
 * import com.pulumi.auth0.ResourceServerArgs;
 * import com.pulumi.auth0.inputs.ResourceServerScopeArgs;
 * import com.pulumi.auth0.Role;
 * import com.pulumi.auth0.RoleArgs;
 * import com.pulumi.auth0.inputs.RolePermissionArgs;
 * import com.pulumi.auth0.User;
 * import com.pulumi.auth0.UserArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var myResourceServer = new ResourceServer(&#34;myResourceServer&#34;, ResourceServerArgs.builder()        
 *             .identifier(&#34;my-resource-server-identifier&#34;)
 *             .signingAlg(&#34;RS256&#34;)
 *             .tokenLifetime(86400)
 *             .skipConsentForVerifiableFirstPartyClients(true)
 *             .enforcePolicies(true)
 *             .scopes(ResourceServerScopeArgs.builder()
 *                 .value(&#34;read:something&#34;)
 *                 .description(&#34;read something&#34;)
 *                 .build())
 *             .build());
 * 
 *         var myRole = new Role(&#34;myRole&#34;, RoleArgs.builder()        
 *             .description(&#34;Role Description...&#34;)
 *             .permissions(RolePermissionArgs.builder()
 *                 .resourceServerIdentifier(myResourceServer.identifier())
 *                 .name(&#34;read:something&#34;)
 *                 .build())
 *             .build());
 * 
 *         var myUser = new User(&#34;myUser&#34;, UserArgs.builder()        
 *             .connectionName(&#34;Username-Password-Authentication&#34;)
 *             .userId(&#34;auth0|1234567890&#34;)
 *             .email(&#34;test@test.com&#34;)
 *             .password(&#34;passpass$12$12&#34;)
 *             .nickname(&#34;testnick&#34;)
 *             .username(&#34;testnick&#34;)
 *             .roles(myRole.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Existing roles can be imported using their ID. # Example
 * 
 * ```sh
 *  $ pulumi import auth0:index/role:Role my_role XXXXXXXXXXXXXXXXXXXXXXX
 * ```
 * 
 */
@ResourceType(type="auth0:index/role:Role")
public class Role extends com.pulumi.resources.CustomResource {
    /**
     * Description of the role.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the role.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Name for this role.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name for this role.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration settings for permissions (scopes) attached to the role.
     * 
     */
    @Export(name="permissions", type=List.class, parameters={RolePermission.class})
    private Output</* @Nullable */ List<RolePermission>> permissions;

    /**
     * @return Configuration settings for permissions (scopes) attached to the role.
     * 
     */
    public Output<Optional<List<RolePermission>>> permissions() {
        return Codegen.optional(this.permissions);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Role(String name) {
        this(name, RoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Role(String name, @Nullable RoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Role(String name, @Nullable RoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/role:Role", name, args == null ? RoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Role(String name, Output<String> id, @Nullable RoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/role:Role", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Role get(String name, Output<String> id, @Nullable RoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Role(name, id, state, options);
    }
}
