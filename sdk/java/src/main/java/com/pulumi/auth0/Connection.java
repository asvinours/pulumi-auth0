// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.ConnectionArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.ConnectionState;
import com.pulumi.auth0.outputs.ConnectionOptions;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * With Auth0, you can define sources of users, otherwise known as connections, which may include identity providers (such as Google or LinkedIn), databases, or passwordless authentication methods. This resource allows you to configure and manage connections to be used with your clients and users.
 * 
 * &gt; The Auth0 dashboard displays only one connection per social provider. Although the Auth0 Management API allows the
 * creation of multiple connections per strategy, the additional connections may not be visible in the Auth0 dashboard.
 * 
 * ## Example Usage
 * ### Google OAuth2 Connection
 * 
 * &gt; Your Auth0 account may be pre-configured with a `google-oauth2` connection.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Connection;
 * import com.pulumi.auth0.ConnectionArgs;
 * import com.pulumi.auth0.inputs.ConnectionOptionsArgs;
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
 *         var googleOauth2 = new Connection(&#34;googleOauth2&#34;, ConnectionArgs.builder()        
 *             .options(ConnectionOptionsArgs.builder()
 *                 .allowedAudiences(                
 *                     &#34;example.com&#34;,
 *                     &#34;api.example.com&#34;)
 *                 .clientId(&#34;&lt;client-id&gt;&#34;)
 *                 .clientSecret(&#34;&lt;client-secret&gt;&#34;)
 *                 .scopes(                
 *                     &#34;email&#34;,
 *                     &#34;profile&#34;,
 *                     &#34;gmail&#34;,
 *                     &#34;youtube&#34;)
 *                 .setUserRootAttributes(&#34;on_each_login&#34;)
 *                 .build())
 *             .strategy(&#34;google-oauth2&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Facebook Connection
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Connection;
 * import com.pulumi.auth0.ConnectionArgs;
 * import com.pulumi.auth0.inputs.ConnectionOptionsArgs;
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
 *         var facebook = new Connection(&#34;facebook&#34;, ConnectionArgs.builder()        
 *             .options(ConnectionOptionsArgs.builder()
 *                 .clientId(&#34;&lt;client-id&gt;&#34;)
 *                 .clientSecret(&#34;&lt;client-secret&gt;&#34;)
 *                 .scopes(                
 *                     &#34;public_profile&#34;,
 *                     &#34;email&#34;,
 *                     &#34;groups_access_member_info&#34;,
 *                     &#34;user_birthday&#34;)
 *                 .build())
 *             .strategy(&#34;facebook&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Apple Connection
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Connection;
 * import com.pulumi.auth0.ConnectionArgs;
 * import com.pulumi.auth0.inputs.ConnectionOptionsArgs;
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
 *         var apple = new Connection(&#34;apple&#34;, ConnectionArgs.builder()        
 *             .options(ConnectionOptionsArgs.builder()
 *                 .clientId(&#34;&lt;client-id&gt;&#34;)
 *                 .clientSecret(&#34;&lt;private-key&gt;&#34;)
 *                 .keyId(&#34;&lt;key-id&gt;&#34;)
 *                 .scopes(                
 *                     &#34;email&#34;,
 *                     &#34;name&#34;)
 *                 .teamId(&#34;&lt;team-id&gt;&#34;)
 *                 .build())
 *             .strategy(&#34;apple&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### LinkedIn Connection
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Connection;
 * import com.pulumi.auth0.ConnectionArgs;
 * import com.pulumi.auth0.inputs.ConnectionOptionsArgs;
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
 *         var linkedin = new Connection(&#34;linkedin&#34;, ConnectionArgs.builder()        
 *             .options(ConnectionOptionsArgs.builder()
 *                 .clientId(&#34;&lt;client-id&gt;&#34;)
 *                 .clientSecret(&#34;&lt;client-secret&gt;&#34;)
 *                 .scopes(                
 *                     &#34;basic_profile&#34;,
 *                     &#34;profile&#34;,
 *                     &#34;email&#34;)
 *                 .strategyVersion(2)
 *                 .build())
 *             .strategy(&#34;linkedin&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### GitHub Connection
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Connection;
 * import com.pulumi.auth0.ConnectionArgs;
 * import com.pulumi.auth0.inputs.ConnectionOptionsArgs;
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
 *         var github = new Connection(&#34;github&#34;, ConnectionArgs.builder()        
 *             .options(ConnectionOptionsArgs.builder()
 *                 .clientId(&#34;&lt;client-id&gt;&#34;)
 *                 .clientSecret(&#34;&lt;client-secret&gt;&#34;)
 *                 .scopes(                
 *                     &#34;email&#34;,
 *                     &#34;profile&#34;,
 *                     &#34;public_repo&#34;,
 *                     &#34;repo&#34;)
 *                 .build())
 *             .strategy(&#34;github&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### SalesForce Connection
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Connection;
 * import com.pulumi.auth0.ConnectionArgs;
 * import com.pulumi.auth0.inputs.ConnectionOptionsArgs;
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
 *         var salesforce = new Connection(&#34;salesforce&#34;, ConnectionArgs.builder()        
 *             .options(ConnectionOptionsArgs.builder()
 *                 .clientId(&#34;&lt;client-id&gt;&#34;)
 *                 .clientSecret(&#34;&lt;client-secret&gt;&#34;)
 *                 .communityBaseUrl(&#34;https://salesforce.example.com&#34;)
 *                 .build())
 *             .strategy(&#34;salesforce&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### OAuth2 Connection
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Connection;
 * import com.pulumi.auth0.ConnectionArgs;
 * import com.pulumi.auth0.inputs.ConnectionOptionsArgs;
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
 *         var oauth2 = new Connection(&#34;oauth2&#34;, ConnectionArgs.builder()        
 *             .options(ConnectionOptionsArgs.builder()
 *                 .authorizationEndpoint(&#34;https://auth.example.com/oauth2/authorize&#34;)
 *                 .clientId(&#34;&lt;client-id&gt;&#34;)
 *                 .clientSecret(&#34;&lt;client-secret&gt;&#34;)
 *                 .pkceEnabled(true)
 *                 .scripts(Map.of(&#34;fetchUserProfile&#34;, &#34;&#34;&#34;
 *         function fetchUserProfile(accessToken, context, callback) {
 *           return callback(new Error(&#34;Whoops!&#34;));
 *         }
 *       
 *                 &#34;&#34;&#34;))
 *                 .tokenEndpoint(&#34;https://auth.example.com/oauth2/token&#34;)
 *                 .build())
 *             .strategy(&#34;oauth2&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### SMS Connection
 * 
 * &gt; To be able to see this in the management dashboard as well, the name of the connection must be set to &#34;sms&#34;.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Connection;
 * import com.pulumi.auth0.ConnectionArgs;
 * import com.pulumi.auth0.inputs.ConnectionOptionsArgs;
 * import com.pulumi.auth0.inputs.ConnectionOptionsGatewayAuthenticationArgs;
 * import com.pulumi.auth0.inputs.ConnectionOptionsTotpArgs;
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
 *         var sms = new Connection(&#34;sms&#34;, ConnectionArgs.builder()        
 *             .isDomainConnection(false)
 *             .options(ConnectionOptionsArgs.builder()
 *                 .bruteForceProtection(true)
 *                 .disableSignup(false)
 *                 .forwardRequestInfo(true)
 *                 .from(&#34;+15555555555&#34;)
 *                 .gatewayAuthentication(ConnectionOptionsGatewayAuthenticationArgs.builder()
 *                     .audience(&#34;https://somewhere.com/sms-gateway&#34;)
 *                     .method(&#34;bearer&#34;)
 *                     .secret(&#34;4e2680bb74ec2ae24736476dd37ed6c2&#34;)
 *                     .secretBase64Encoded(false)
 *                     .subject(&#34;test.us.auth0.com:sms&#34;)
 *                     .build())
 *                 .gatewayUrl(&#34;https://somewhere.com/sms-gateway&#34;)
 *                 .name(&#34;sms&#34;)
 *                 .provider(&#34;sms_gateway&#34;)
 *                 .syntax(&#34;md_with_macros&#34;)
 *                 .template(&#34;@@password@@&#34;)
 *                 .totp(ConnectionOptionsTotpArgs.builder()
 *                     .length(6)
 *                     .timeStep(300)
 *                     .build())
 *                 .build())
 *             .strategy(&#34;sms&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Email Connection
 * 
 * &gt; To be able to see this in the management dashboard as well, the name of the connection must be set to &#34;email&#34;.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Connection;
 * import com.pulumi.auth0.ConnectionArgs;
 * import com.pulumi.auth0.inputs.ConnectionOptionsArgs;
 * import com.pulumi.auth0.inputs.ConnectionOptionsTotpArgs;
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
 *         var passwordlessEmail = new Connection(&#34;passwordlessEmail&#34;, ConnectionArgs.builder()        
 *             .options(ConnectionOptionsArgs.builder()
 *                 .authParams(Map.ofEntries(
 *                     Map.entry(&#34;responseType&#34;, &#34;code&#34;),
 *                     Map.entry(&#34;scope&#34;, &#34;openid email profile offline_access&#34;)
 *                 ))
 *                 .bruteForceProtection(true)
 *                 .disableSignup(false)
 *                 .from(&#34;{{ application.name }} &lt;root@auth0.com&gt;&#34;)
 *                 .nonPersistentAttrs()
 *                 .setUserRootAttributes()
 *                 .subject(&#34;Welcome to {{ application.name }}&#34;)
 *                 .syntax(&#34;liquid&#34;)
 *                 .template(&#34;&lt;html&gt;This is the body of the email&lt;/html&gt;&#34;)
 *                 .totp(ConnectionOptionsTotpArgs.builder()
 *                     .length(6)
 *                     .timeStep(300)
 *                     .build())
 *                 .build())
 *             .strategy(&#34;email&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### WindowsLive Connection
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Connection;
 * import com.pulumi.auth0.ConnectionArgs;
 * import com.pulumi.auth0.inputs.ConnectionOptionsArgs;
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
 *         var windowslive = new Connection(&#34;windowslive&#34;, ConnectionArgs.builder()        
 *             .options(ConnectionOptionsArgs.builder()
 *                 .clientId(&#34;&lt;client-id&gt;&#34;)
 *                 .clientSecret(&#34;&lt;client-secret&gt;&#34;)
 *                 .scopes(                
 *                     &#34;signin&#34;,
 *                     &#34;graph_user&#34;)
 *                 .strategyVersion(2)
 *                 .build())
 *             .strategy(&#34;windowslive&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Connections can be imported using their ID. # Example
 * 
 * ```sh
 *  $ pulumi import auth0:index/connection:Connection google con_a17f21fdb24d48a0
 * ```
 * 
 */
@ResourceType(type="auth0:index/connection:Connection")
public class Connection extends com.pulumi.resources.CustomResource {
    /**
     * Name used in login screen.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Name used in login screen.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * IDs of the clients for which the connection is enabled.
     * 
     */
    @Export(name="enabledClients", type=List.class, parameters={String.class})
    private Output<List<String>> enabledClients;

    /**
     * @return IDs of the clients for which the connection is enabled.
     * 
     */
    public Output<List<String>> enabledClients() {
        return this.enabledClients;
    }
    /**
     * Indicates whether the connection is domain level.
     * 
     */
    @Export(name="isDomainConnection", type=Boolean.class, parameters={})
    private Output<Boolean> isDomainConnection;

    /**
     * @return Indicates whether the connection is domain level.
     * 
     */
    public Output<Boolean> isDomainConnection() {
        return this.isDomainConnection;
    }
    /**
     * Metadata associated with the connection, in the form of a map of string values (max 255 chars). Maximum of 10 metadata properties allowed.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return Metadata associated with the connection, in the form of a map of string values (max 255 chars). Maximum of 10 metadata properties allowed.
     * 
     */
    public Output<Optional<Map<String,String>>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * Name of the connection.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the connection.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration settings for connection options.
     * 
     */
    @Export(name="options", type=ConnectionOptions.class, parameters={})
    private Output<ConnectionOptions> options;

    /**
     * @return Configuration settings for connection options.
     * 
     */
    public Output<ConnectionOptions> options() {
        return this.options;
    }
    /**
     * Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
     * 
     */
    @Export(name="realms", type=List.class, parameters={String.class})
    private Output<List<String>> realms;

    /**
     * @return Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
     * 
     */
    public Output<List<String>> realms() {
        return this.realms;
    }
    /**
     * Display connection as a button. Only available on enterprise connections.
     * 
     */
    @Export(name="showAsButton", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> showAsButton;

    /**
     * @return Display connection as a button. Only available on enterprise connections.
     * 
     */
    public Output<Optional<Boolean>> showAsButton() {
        return Codegen.optional(this.showAsButton);
    }
    /**
     * Type of the connection, which indicates the identity provider.
     * 
     */
    @Export(name="strategy", type=String.class, parameters={})
    private Output<String> strategy;

    /**
     * @return Type of the connection, which indicates the identity provider.
     * 
     */
    public Output<String> strategy() {
        return this.strategy;
    }
    @Export(name="strategyVersion", type=String.class, parameters={})
    private Output<String> strategyVersion;

    public Output<String> strategyVersion() {
        return this.strategyVersion;
    }
    @Export(name="validation", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> validation;

    public Output<Optional<Map<String,String>>> validation() {
        return Codegen.optional(this.validation);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connection(String name) {
        this(name, ConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connection(String name, ConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(String name, ConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/connection:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connection(String name, Output<String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/connection:Connection", name, state, makeResourceOptions(options, id));
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
    public static Connection get(String name, Output<String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, state, options);
    }
}
