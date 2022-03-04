// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * With this resource, you can manage user identities, including resetting passwords, and creating, provisioning, blocking,
 * and deleting users.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const admin = new auth0.Role("admin", {description: "Administrator"});
 * const user = new auth0.User("user", {
 *     connectionName: "Username-Password-Authentication",
 *     userId: "12345",
 *     username: "unique_username",
 *     givenName: "Firstname",
 *     familyName: "Lastname",
 *     nickname: "some.nickname",
 *     email: "test@test.com",
 *     emailVerified: true,
 *     password: `passpass$12$12`,
 *     roles: [admin.id],
 * });
 * ```
 *
 * ## Import
 *
 * auth0_user can be imported using the user ID, e.g.
 *
 * ```sh
 *  $ pulumi import auth0:index/user:User user auth0|111111111111111111111111
 * ```
 */
export class User extends pulumi.CustomResource {
    /**
     * Get an existing User resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserState, opts?: pulumi.CustomResourceOptions): User {
        return new User(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/user:User';

    /**
     * Returns true if the given object is an instance of User.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is User {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === User.__pulumiType;
    }

    /**
     * String, JSON format. Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
     */
    public readonly appMetadata!: pulumi.Output<string | undefined>;
    public readonly blocked!: pulumi.Output<boolean | undefined>;
    /**
     * String. Name of the connection from which the user information was sourced.
     */
    public readonly connectionName!: pulumi.Output<string>;
    /**
     * String. Email address of the user.
     */
    public readonly email!: pulumi.Output<string | undefined>;
    /**
     * Boolean. Indicates whether the email address has been verified.
     */
    public readonly emailVerified!: pulumi.Output<boolean | undefined>;
    public readonly familyName!: pulumi.Output<string | undefined>;
    public readonly givenName!: pulumi.Output<string | undefined>;
    public readonly name!: pulumi.Output<string>;
    /**
     * String. Preferred nickname or alias of the user.
     */
    public readonly nickname!: pulumi.Output<string>;
    /**
     * String, Case-sensitive. Initial password for this user. Required for non-passwordless connections (SMS and email).
     */
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * String. Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
     */
    public readonly phoneNumber!: pulumi.Output<string | undefined>;
    /**
     * Boolean. Indicates whether the phone number has been verified.
     */
    public readonly phoneVerified!: pulumi.Output<boolean | undefined>;
    public readonly picture!: pulumi.Output<string>;
    /**
     * Set(String). Set of IDs of roles assigned to the user.
     */
    public readonly roles!: pulumi.Output<string[] | undefined>;
    /**
     * String. ID of the user.
     */
    public readonly userId!: pulumi.Output<string>;
    /**
     * String, JSON format. Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
     */
    public readonly userMetadata!: pulumi.Output<string | undefined>;
    /**
     * String. Username of the user. Only valid if the connection requires a username.
     */
    public readonly username!: pulumi.Output<string | undefined>;
    /**
     * Boolean. Indicates whether the user will receive a verification email after creation. Overrides behavior of `emailVerified` parameter.
     */
    public readonly verifyEmail!: pulumi.Output<boolean | undefined>;

    /**
     * Create a User resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserArgs | UserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserState | undefined;
            resourceInputs["appMetadata"] = state ? state.appMetadata : undefined;
            resourceInputs["blocked"] = state ? state.blocked : undefined;
            resourceInputs["connectionName"] = state ? state.connectionName : undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["emailVerified"] = state ? state.emailVerified : undefined;
            resourceInputs["familyName"] = state ? state.familyName : undefined;
            resourceInputs["givenName"] = state ? state.givenName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nickname"] = state ? state.nickname : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["phoneNumber"] = state ? state.phoneNumber : undefined;
            resourceInputs["phoneVerified"] = state ? state.phoneVerified : undefined;
            resourceInputs["picture"] = state ? state.picture : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
            resourceInputs["userMetadata"] = state ? state.userMetadata : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
            resourceInputs["verifyEmail"] = state ? state.verifyEmail : undefined;
        } else {
            const args = argsOrState as UserArgs | undefined;
            if ((!args || args.connectionName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionName'");
            }
            resourceInputs["appMetadata"] = args ? args.appMetadata : undefined;
            resourceInputs["blocked"] = args ? args.blocked : undefined;
            resourceInputs["connectionName"] = args ? args.connectionName : undefined;
            resourceInputs["email"] = args ? args.email : undefined;
            resourceInputs["emailVerified"] = args ? args.emailVerified : undefined;
            resourceInputs["familyName"] = args ? args.familyName : undefined;
            resourceInputs["givenName"] = args ? args.givenName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nickname"] = args ? args.nickname : undefined;
            resourceInputs["password"] = args ? args.password : undefined;
            resourceInputs["phoneNumber"] = args ? args.phoneNumber : undefined;
            resourceInputs["phoneVerified"] = args ? args.phoneVerified : undefined;
            resourceInputs["picture"] = args ? args.picture : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
            resourceInputs["userMetadata"] = args ? args.userMetadata : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
            resourceInputs["verifyEmail"] = args ? args.verifyEmail : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(User.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering User resources.
 */
export interface UserState {
    /**
     * String, JSON format. Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
     */
    appMetadata?: pulumi.Input<string>;
    blocked?: pulumi.Input<boolean>;
    /**
     * String. Name of the connection from which the user information was sourced.
     */
    connectionName?: pulumi.Input<string>;
    /**
     * String. Email address of the user.
     */
    email?: pulumi.Input<string>;
    /**
     * Boolean. Indicates whether the email address has been verified.
     */
    emailVerified?: pulumi.Input<boolean>;
    familyName?: pulumi.Input<string>;
    givenName?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    /**
     * String. Preferred nickname or alias of the user.
     */
    nickname?: pulumi.Input<string>;
    /**
     * String, Case-sensitive. Initial password for this user. Required for non-passwordless connections (SMS and email).
     */
    password?: pulumi.Input<string>;
    /**
     * String. Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
     */
    phoneNumber?: pulumi.Input<string>;
    /**
     * Boolean. Indicates whether the phone number has been verified.
     */
    phoneVerified?: pulumi.Input<boolean>;
    picture?: pulumi.Input<string>;
    /**
     * Set(String). Set of IDs of roles assigned to the user.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * String. ID of the user.
     */
    userId?: pulumi.Input<string>;
    /**
     * String, JSON format. Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
     */
    userMetadata?: pulumi.Input<string>;
    /**
     * String. Username of the user. Only valid if the connection requires a username.
     */
    username?: pulumi.Input<string>;
    /**
     * Boolean. Indicates whether the user will receive a verification email after creation. Overrides behavior of `emailVerified` parameter.
     */
    verifyEmail?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a User resource.
 */
export interface UserArgs {
    /**
     * String, JSON format. Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
     */
    appMetadata?: pulumi.Input<string>;
    blocked?: pulumi.Input<boolean>;
    /**
     * String. Name of the connection from which the user information was sourced.
     */
    connectionName: pulumi.Input<string>;
    /**
     * String. Email address of the user.
     */
    email?: pulumi.Input<string>;
    /**
     * Boolean. Indicates whether the email address has been verified.
     */
    emailVerified?: pulumi.Input<boolean>;
    familyName?: pulumi.Input<string>;
    givenName?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    /**
     * String. Preferred nickname or alias of the user.
     */
    nickname?: pulumi.Input<string>;
    /**
     * String, Case-sensitive. Initial password for this user. Required for non-passwordless connections (SMS and email).
     */
    password?: pulumi.Input<string>;
    /**
     * String. Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
     */
    phoneNumber?: pulumi.Input<string>;
    /**
     * Boolean. Indicates whether the phone number has been verified.
     */
    phoneVerified?: pulumi.Input<boolean>;
    picture?: pulumi.Input<string>;
    /**
     * Set(String). Set of IDs of roles assigned to the user.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * String. ID of the user.
     */
    userId?: pulumi.Input<string>;
    /**
     * String, JSON format. Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
     */
    userMetadata?: pulumi.Input<string>;
    /**
     * String. Username of the user. Only valid if the connection requires a username.
     */
    username?: pulumi.Input<string>;
    /**
     * Boolean. Indicates whether the user will receive a verification email after creation. Overrides behavior of `emailVerified` parameter.
     */
    verifyEmail?: pulumi.Input<boolean>;
}
