// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.ResourceServerScopeArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.ResourceServerScopeState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * With this resource, you can manage scopes (permissions) associated with a resource server (API).
 * 
 * !&gt; This resource appends a scope to a resource server. In contrast, the `auth0.ResourceServerScopes` resource manages
 * all the scopes assigned to a resource server. To avoid potential issues, it is recommended not to use this resource in
 * conjunction with the `auth0.ResourceServerScopes` resource when managing scopes for the same resource server id.
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
 * import com.pulumi.auth0.ResourceServerScope;
 * import com.pulumi.auth0.ResourceServerScopeArgs;
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
 *         var resourceServer = new ResourceServer(&#34;resourceServer&#34;, ResourceServerArgs.builder()        
 *             .identifier(&#34;https://api.example.com&#34;)
 *             .build());
 * 
 *         var readPosts = new ResourceServerScope(&#34;readPosts&#34;, ResourceServerScopeArgs.builder()        
 *             .resourceServerIdentifier(resourceServer.identifier())
 *             .scope(&#34;read:posts&#34;)
 *             .build());
 * 
 *         var writePosts = new ResourceServerScope(&#34;writePosts&#34;, ResourceServerScopeArgs.builder()        
 *             .resourceServerIdentifier(resourceServer.identifier())
 *             .scope(&#34;write:posts&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported by specifying the resource identifier and scope name separated by &#34;::&#34; (note the double colon) &lt;resourceServerIdentifier&gt;::&lt;scope&gt; # Example
 * 
 * ```sh
 *  $ pulumi import auth0:index/resourceServerScope:ResourceServerScope scope &#34;https://api.travel0.com/v1::read:posts&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/resourceServerScope:ResourceServerScope")
public class ResourceServerScope extends com.pulumi.resources.CustomResource {
    /**
     * Description of the scope (permission).
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the scope (permission).
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Identifier of the resource server that the scope (permission) is associated with.
     * 
     */
    @Export(name="resourceServerIdentifier", type=String.class, parameters={})
    private Output<String> resourceServerIdentifier;

    /**
     * @return Identifier of the resource server that the scope (permission) is associated with.
     * 
     */
    public Output<String> resourceServerIdentifier() {
        return this.resourceServerIdentifier;
    }
    /**
     * Name of the scope (permission).
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return Name of the scope (permission).
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceServerScope(String name) {
        this(name, ResourceServerScopeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceServerScope(String name, ResourceServerScopeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceServerScope(String name, ResourceServerScopeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/resourceServerScope:ResourceServerScope", name, args == null ? ResourceServerScopeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceServerScope(String name, Output<String> id, @Nullable ResourceServerScopeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/resourceServerScope:ResourceServerScope", name, state, makeResourceOptions(options, id));
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
    public static ResourceServerScope get(String name, Output<String> id, @Nullable ResourceServerScopeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourceServerScope(name, id, state, options);
    }
}
