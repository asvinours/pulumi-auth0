// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.PromptCustomTextArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.PromptCustomTextState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * With this resource, you can manage custom text on your Auth0 prompts. You can read more about custom texts
 * [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.PromptCustomText;
 * import com.pulumi.auth0.PromptCustomTextArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var example = new PromptCustomText(&#34;example&#34;, PromptCustomTextArgs.builder()        
 *             .prompt(&#34;login&#34;)
 *             .language(&#34;en&#34;)
 *             .body(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;login&#34;, jsonObject(
 *                         jsonProperty(&#34;alertListTitle&#34;, &#34;Alerts&#34;),
 *                         jsonProperty(&#34;buttonText&#34;, &#34;Continue&#34;),
 *                         jsonProperty(&#34;description&#34;, &#34;Login to&#34;),
 *                         jsonProperty(&#34;editEmailText&#34;, &#34;Edit&#34;),
 *                         jsonProperty(&#34;emailPlaceholder&#34;, &#34;Email address&#34;),
 *                         jsonProperty(&#34;federatedConnectionButtonText&#34;, String.format(&#34;Continue with %s&#34;, connectionName)),
 *                         jsonProperty(&#34;footerLinkText&#34;, &#34;Sign up&#34;),
 *                         jsonProperty(&#34;footerText&#34;, &#34;Don&#39;t have an account?&#34;),
 *                         jsonProperty(&#34;forgotPasswordText&#34;, &#34;Forgot password?&#34;),
 *                         jsonProperty(&#34;invitationDescription&#34;, String.format(&#34;Log in to accept %s&#39;s invitation to join %s on %s.&#34;, inviterName,companyName,clientName)),
 *                         jsonProperty(&#34;invitationTitle&#34;, &#34;You&#39;ve Been Invited!&#34;),
 *                         jsonProperty(&#34;logoAltText&#34;, companyName),
 *                         jsonProperty(&#34;pageTitle&#34;, String.format(&#34;Log in | %s&#34;, clientName)),
 *                         jsonProperty(&#34;passwordPlaceholder&#34;, &#34;Password&#34;),
 *                         jsonProperty(&#34;separatorText&#34;, &#34;Or&#34;),
 *                         jsonProperty(&#34;signupActionLinkText&#34;, footerLinkText),
 *                         jsonProperty(&#34;signupActionText&#34;, footerText),
 *                         jsonProperty(&#34;title&#34;, &#34;Welcome&#34;),
 *                         jsonProperty(&#34;usernamePlaceholder&#34;, &#34;Username or email address&#34;)
 *                     ))
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported using the import command and specifying the prompt and language separated by *:* , e.g.
 * 
 * ```sh
 *  $ pulumi import auth0:index/promptCustomText:PromptCustomText example login:en
 * ```
 * 
 */
@ResourceType(type="auth0:index/promptCustomText:PromptCustomText")
public class PromptCustomText extends com.pulumi.resources.CustomResource {
    /**
     * JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values)
     * 
     */
    @Export(name="body", type=String.class, parameters={})
    private Output<String> body;

    /**
     * @return JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values)
     * 
     */
    public Output<String> body() {
        return this.body;
    }
    /**
     * Language of the custom text. Options include `ar`, `bg`, `bs`, `cs`, `da`, `de`, `el`, `en`, `es`, `et`, `fi`, `fr`, `fr-CA`, `fr-FR`, `he`, `hi`, `hr`, `hu`, `id`, `is`, `it`, `ja`, `ko`, `lt`, `lv`, `nb`, `nl`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `sr`, `sv`, `th`, `tr`, `uk`, `vi`, `zh-CN`, `zh-TW`
     * 
     */
    @Export(name="language", type=String.class, parameters={})
    private Output<String> language;

    /**
     * @return Language of the custom text. Options include `ar`, `bg`, `bs`, `cs`, `da`, `de`, `el`, `en`, `es`, `et`, `fi`, `fr`, `fr-CA`, `fr-FR`, `he`, `hi`, `hr`, `hu`, `id`, `is`, `it`, `ja`, `ko`, `lt`, `lv`, `nb`, `nl`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `sr`, `sv`, `th`, `tr`, `uk`, `vi`, `zh-CN`, `zh-TW`
     * 
     */
    public Output<String> language() {
        return this.language;
    }
    /**
     * The term `prompt` is used to refer to a specific step in the login flow. Options include `login`, `login-id`, `login-password`, `login-email-verification`, `signup`, `signup-id`, `signup-password`, `reset-password`, `consent`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`
     * 
     */
    @Export(name="prompt", type=String.class, parameters={})
    private Output<String> prompt;

    /**
     * @return The term `prompt` is used to refer to a specific step in the login flow. Options include `login`, `login-id`, `login-password`, `login-email-verification`, `signup`, `signup-id`, `signup-password`, `reset-password`, `consent`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`
     * 
     */
    public Output<String> prompt() {
        return this.prompt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PromptCustomText(String name) {
        this(name, PromptCustomTextArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PromptCustomText(String name, PromptCustomTextArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PromptCustomText(String name, PromptCustomTextArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/promptCustomText:PromptCustomText", name, args == null ? PromptCustomTextArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PromptCustomText(String name, Output<String> id, @Nullable PromptCustomTextState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/promptCustomText:PromptCustomText", name, state, makeResourceOptions(options, id));
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
    public static PromptCustomText get(String name, Output<String> id, @Nullable PromptCustomTextState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PromptCustomText(name, id, state, options);
    }
}
