// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.EmailProviderArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.EmailProviderState;
import com.pulumi.auth0.outputs.EmailProviderCredentials;
import com.pulumi.auth0.outputs.EmailProviderSettings;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * With Auth0, you can have standard welcome, password reset, and account verification email-based workflows built right into Auth0. This resource allows you to configure email providers, so you can route all emails that are part of Auth0&#39;s authentication workflows through the supported high-volume email service of your choice.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.EmailProvider;
 * import com.pulumi.auth0.EmailProviderArgs;
 * import com.pulumi.auth0.inputs.EmailProviderCredentialsArgs;
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
 *         var amazonSesEmailProvider = new EmailProvider(&#34;amazonSesEmailProvider&#34;, EmailProviderArgs.builder()        
 *             .credentials(EmailProviderCredentialsArgs.builder()
 *                 .accessKeyId(&#34;AKIAXXXXXXXXXXXXXXXX&#34;)
 *                 .region(&#34;us-east-1&#34;)
 *                 .secretAccessKey(&#34;7e8c2148xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx&#34;)
 *                 .build())
 *             .defaultFromAddress(&#34;accounts@example.com&#34;)
 *             .enabled(true)
 *             .build());
 * 
 *         var sendgridEmailProvider = new EmailProvider(&#34;sendgridEmailProvider&#34;, EmailProviderArgs.builder()        
 *             .credentials(EmailProviderCredentialsArgs.builder()
 *                 .apiKey(&#34;secretAPIKey&#34;)
 *                 .build())
 *             .defaultFromAddress(&#34;accounts@example.com&#34;)
 *             .enabled(true)
 *             .build());
 * 
 *         var smtpEmailProvider = new EmailProvider(&#34;smtpEmailProvider&#34;, EmailProviderArgs.builder()        
 *             .credentials(EmailProviderCredentialsArgs.builder()
 *                 .ms365ClientId(&#34;ms365_client_id&#34;)
 *                 .ms365ClientSecret(&#34;ms365_client_secret&#34;)
 *                 .ms365TenantId(&#34;ms365_tenant_id&#34;)
 *                 .build())
 *             .defaultFromAddress(&#34;accounts@example.com&#34;)
 *             .enabled(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * As this is not a resource identifiable by an ID within the Auth0 Management API,
 * 
 *  email can be imported using a random string.
 * 
 * # 
 * 
 *  We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)
 * 
 * # 
 * 
 *  Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/emailProvider:EmailProvider my_email_provider &#34;b4213dc2-2eed-42c3-9516-c6131a9ce0b0&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/emailProvider:EmailProvider")
public class EmailProvider extends com.pulumi.resources.CustomResource {
    /**
     * Configuration settings for the credentials for the email provider.
     * 
     */
    @Export(name="credentials", refs={EmailProviderCredentials.class}, tree="[0]")
    private Output<EmailProviderCredentials> credentials;

    /**
     * @return Configuration settings for the credentials for the email provider.
     * 
     */
    public Output<EmailProviderCredentials> credentials() {
        return this.credentials;
    }
    /**
     * Email address to use as the sender when no other &#34;from&#34; address is specified.
     * 
     */
    @Export(name="defaultFromAddress", refs={String.class}, tree="[0]")
    private Output<String> defaultFromAddress;

    /**
     * @return Email address to use as the sender when no other &#34;from&#34; address is specified.
     * 
     */
    public Output<String> defaultFromAddress() {
        return this.defaultFromAddress;
    }
    /**
     * Indicates whether the email provider is enabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Indicates whether the email provider is enabled.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Name of the email provider. Options include `azure_cs`, `mailgun`, `mandrill`, `ms365`, `sendgrid`, `ses`, `smtp` and `sparkpost`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the email provider. Options include `azure_cs`, `mailgun`, `mandrill`, `ms365`, `sendgrid`, `ses`, `smtp` and `sparkpost`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specific email provider settings.
     * 
     */
    @Export(name="settings", refs={EmailProviderSettings.class}, tree="[0]")
    private Output<EmailProviderSettings> settings;

    /**
     * @return Specific email provider settings.
     * 
     */
    public Output<EmailProviderSettings> settings() {
        return this.settings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EmailProvider(String name) {
        this(name, EmailProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EmailProvider(String name, EmailProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EmailProvider(String name, EmailProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/emailProvider:EmailProvider", name, args == null ? EmailProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EmailProvider(String name, Output<String> id, @Nullable EmailProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/emailProvider:EmailProvider", name, state, makeResourceOptions(options, id));
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
    public static EmailProvider get(String name, Output<String> id, @Nullable EmailProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EmailProvider(name, id, state, options);
    }
}
