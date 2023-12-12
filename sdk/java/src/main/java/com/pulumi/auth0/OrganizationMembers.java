// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.OrganizationMembersArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.OrganizationMembersState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource is used to manage members of an organization.
 * 
 * !&gt; This resource manages all the members assigned to an organization. In contrast, the `auth0.OrganizationMember`
 * resource only appends a member to an organization. To avoid potential issues, it is recommended not to use this
 * resource in conjunction with the `auth0.OrganizationMember` resource when managing members for the same organization
 * id.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.User;
 * import com.pulumi.auth0.UserArgs;
 * import com.pulumi.auth0.Organization;
 * import com.pulumi.auth0.OrganizationArgs;
 * import com.pulumi.auth0.OrganizationMembers;
 * import com.pulumi.auth0.OrganizationMembersArgs;
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
 *         var user1 = new User(&#34;user1&#34;, UserArgs.builder()        
 *             .connectionName(&#34;Username-Password-Authentication&#34;)
 *             .email(&#34;myuser1@auth0.com&#34;)
 *             .password(&#34;MyPass123$&#34;)
 *             .build());
 * 
 *         var user2 = new User(&#34;user2&#34;, UserArgs.builder()        
 *             .connectionName(&#34;Username-Password-Authentication&#34;)
 *             .email(&#34;myuser2@auth0.com&#34;)
 *             .password(&#34;MyPass123$&#34;)
 *             .build());
 * 
 *         var myOrg = new Organization(&#34;myOrg&#34;, OrganizationArgs.builder()        
 *             .displayName(&#34;Some Organization&#34;)
 *             .build());
 * 
 *         var myMembers = new OrganizationMembers(&#34;myMembers&#34;, OrganizationMembersArgs.builder()        
 *             .organizationId(myOrg.id())
 *             .members(            
 *                 user1.id(),
 *                 user2.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported by specifying the organization ID. # Example
 * 
 * ```sh
 *  $ pulumi import auth0:index/organizationMembers:OrganizationMembers my_org_members &#34;org_XXXXX&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/organizationMembers:OrganizationMembers")
public class OrganizationMembers extends com.pulumi.resources.CustomResource {
    /**
     * Add user ID(s) directly from the tenant to become members of the organization.
     * 
     */
    @Export(name="members", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> members;

    /**
     * @return Add user ID(s) directly from the tenant to become members of the organization.
     * 
     */
    public Output<List<String>> members() {
        return this.members;
    }
    /**
     * The ID of the organization to assign the members to.
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return The ID of the organization to assign the members to.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationMembers(String name) {
        this(name, OrganizationMembersArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationMembers(String name, OrganizationMembersArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationMembers(String name, OrganizationMembersArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/organizationMembers:OrganizationMembers", name, args == null ? OrganizationMembersArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrganizationMembers(String name, Output<String> id, @Nullable OrganizationMembersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/organizationMembers:OrganizationMembers", name, state, makeResourceOptions(options, id));
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
    public static OrganizationMembers get(String name, Output<String> id, @Nullable OrganizationMembersState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationMembers(name, id, state, options);
    }
}
