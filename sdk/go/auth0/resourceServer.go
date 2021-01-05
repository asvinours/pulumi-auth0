// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// With this resource, you can set up APIs that can be consumed from your authorized applications.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-auth0/sdk/go/auth0"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := auth0.NewResourceServer(ctx, "myResourceServer", &auth0.ResourceServerArgs{
// 			AllowOfflineAccess: pulumi.Bool(true),
// 			Identifier:         pulumi.String("https://api.example.com"),
// 			Scopes: auth0.ResourceServerScopeArray{
// 				&auth0.ResourceServerScopeArgs{
// 					Description: pulumi.String("Create foos"),
// 					Value:       pulumi.String("create:foo"),
// 				},
// 				&auth0.ResourceServerScopeArgs{
// 					Description: pulumi.String("Create bars"),
// 					Value:       pulumi.String("create:bar"),
// 				},
// 			},
// 			SigningAlg: pulumi.String("RS256"),
// 			SkipConsentForVerifiableFirstPartyClients: pulumi.Bool(true),
// 			TokenLifetime: pulumi.Int(8600),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type ResourceServer struct {
	pulumi.CustomResourceState

	// Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
	AllowOfflineAccess pulumi.BoolPtrOutput `pulumi:"allowOfflineAccess"`
	// Boolean. Indicates whether or not authorization polices are enforced.
	EnforcePolicies pulumi.BoolPtrOutput `pulumi:"enforcePolicies"`
	// String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
	Identifier pulumi.StringPtrOutput `pulumi:"identifier"`
	// String. Friendly name for the resource server. Cannot include `<` or `>` characters.
	Name pulumi.StringOutput `pulumi:"name"`
	// Map(String). Used to store additional metadata
	Options pulumi.StringMapOutput `pulumi:"options"`
	// Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
	Scopes ResourceServerScopeArrayOutput `pulumi:"scopes"`
	// String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
	SigningAlg pulumi.StringOutput `pulumi:"signingAlg"`
	// String. Secret used to sign tokens when using symmetric algorithms (HS256).
	SigningSecret pulumi.StringOutput `pulumi:"signingSecret"`
	// Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
	SkipConsentForVerifiableFirstPartyClients pulumi.BoolPtrOutput `pulumi:"skipConsentForVerifiableFirstPartyClients"`
	// String. Dialect of access tokens that should be issued for this resource server. Options include `accessToken` or `accessTokenAuthz` (includes permissions).
	TokenDialect pulumi.StringPtrOutput `pulumi:"tokenDialect"`
	// Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
	TokenLifetime pulumi.IntOutput `pulumi:"tokenLifetime"`
	// Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
	TokenLifetimeForWeb pulumi.IntOutput `pulumi:"tokenLifetimeForWeb"`
	// String
	VerificationLocation pulumi.StringPtrOutput `pulumi:"verificationLocation"`
}

// NewResourceServer registers a new resource with the given unique name, arguments, and options.
func NewResourceServer(ctx *pulumi.Context,
	name string, args *ResourceServerArgs, opts ...pulumi.ResourceOption) (*ResourceServer, error) {
	if args == nil {
		args = &ResourceServerArgs{}
	}
	var resource ResourceServer
	err := ctx.RegisterResource("auth0:index/resourceServer:ResourceServer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResourceServer gets an existing ResourceServer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResourceServer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResourceServerState, opts ...pulumi.ResourceOption) (*ResourceServer, error) {
	var resource ResourceServer
	err := ctx.ReadResource("auth0:index/resourceServer:ResourceServer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResourceServer resources.
type resourceServerState struct {
	// Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
	AllowOfflineAccess *bool `pulumi:"allowOfflineAccess"`
	// Boolean. Indicates whether or not authorization polices are enforced.
	EnforcePolicies *bool `pulumi:"enforcePolicies"`
	// String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
	Identifier *string `pulumi:"identifier"`
	// String. Friendly name for the resource server. Cannot include `<` or `>` characters.
	Name *string `pulumi:"name"`
	// Map(String). Used to store additional metadata
	Options map[string]string `pulumi:"options"`
	// Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
	Scopes []ResourceServerScope `pulumi:"scopes"`
	// String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
	SigningAlg *string `pulumi:"signingAlg"`
	// String. Secret used to sign tokens when using symmetric algorithms (HS256).
	SigningSecret *string `pulumi:"signingSecret"`
	// Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
	SkipConsentForVerifiableFirstPartyClients *bool `pulumi:"skipConsentForVerifiableFirstPartyClients"`
	// String. Dialect of access tokens that should be issued for this resource server. Options include `accessToken` or `accessTokenAuthz` (includes permissions).
	TokenDialect *string `pulumi:"tokenDialect"`
	// Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
	TokenLifetime *int `pulumi:"tokenLifetime"`
	// Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
	TokenLifetimeForWeb *int `pulumi:"tokenLifetimeForWeb"`
	// String
	VerificationLocation *string `pulumi:"verificationLocation"`
}

type ResourceServerState struct {
	// Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
	AllowOfflineAccess pulumi.BoolPtrInput
	// Boolean. Indicates whether or not authorization polices are enforced.
	EnforcePolicies pulumi.BoolPtrInput
	// String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
	Identifier pulumi.StringPtrInput
	// String. Friendly name for the resource server. Cannot include `<` or `>` characters.
	Name pulumi.StringPtrInput
	// Map(String). Used to store additional metadata
	Options pulumi.StringMapInput
	// Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
	Scopes ResourceServerScopeArrayInput
	// String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
	SigningAlg pulumi.StringPtrInput
	// String. Secret used to sign tokens when using symmetric algorithms (HS256).
	SigningSecret pulumi.StringPtrInput
	// Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
	SkipConsentForVerifiableFirstPartyClients pulumi.BoolPtrInput
	// String. Dialect of access tokens that should be issued for this resource server. Options include `accessToken` or `accessTokenAuthz` (includes permissions).
	TokenDialect pulumi.StringPtrInput
	// Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
	TokenLifetime pulumi.IntPtrInput
	// Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
	TokenLifetimeForWeb pulumi.IntPtrInput
	// String
	VerificationLocation pulumi.StringPtrInput
}

func (ResourceServerState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceServerState)(nil)).Elem()
}

type resourceServerArgs struct {
	// Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
	AllowOfflineAccess *bool `pulumi:"allowOfflineAccess"`
	// Boolean. Indicates whether or not authorization polices are enforced.
	EnforcePolicies *bool `pulumi:"enforcePolicies"`
	// String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
	Identifier *string `pulumi:"identifier"`
	// String. Friendly name for the resource server. Cannot include `<` or `>` characters.
	Name *string `pulumi:"name"`
	// Map(String). Used to store additional metadata
	Options map[string]string `pulumi:"options"`
	// Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
	Scopes []ResourceServerScope `pulumi:"scopes"`
	// String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
	SigningAlg *string `pulumi:"signingAlg"`
	// String. Secret used to sign tokens when using symmetric algorithms (HS256).
	SigningSecret *string `pulumi:"signingSecret"`
	// Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
	SkipConsentForVerifiableFirstPartyClients *bool `pulumi:"skipConsentForVerifiableFirstPartyClients"`
	// String. Dialect of access tokens that should be issued for this resource server. Options include `accessToken` or `accessTokenAuthz` (includes permissions).
	TokenDialect *string `pulumi:"tokenDialect"`
	// Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
	TokenLifetime *int `pulumi:"tokenLifetime"`
	// Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
	TokenLifetimeForWeb *int `pulumi:"tokenLifetimeForWeb"`
	// String
	VerificationLocation *string `pulumi:"verificationLocation"`
}

// The set of arguments for constructing a ResourceServer resource.
type ResourceServerArgs struct {
	// Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
	AllowOfflineAccess pulumi.BoolPtrInput
	// Boolean. Indicates whether or not authorization polices are enforced.
	EnforcePolicies pulumi.BoolPtrInput
	// String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
	Identifier pulumi.StringPtrInput
	// String. Friendly name for the resource server. Cannot include `<` or `>` characters.
	Name pulumi.StringPtrInput
	// Map(String). Used to store additional metadata
	Options pulumi.StringMapInput
	// Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
	Scopes ResourceServerScopeArrayInput
	// String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
	SigningAlg pulumi.StringPtrInput
	// String. Secret used to sign tokens when using symmetric algorithms (HS256).
	SigningSecret pulumi.StringPtrInput
	// Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
	SkipConsentForVerifiableFirstPartyClients pulumi.BoolPtrInput
	// String. Dialect of access tokens that should be issued for this resource server. Options include `accessToken` or `accessTokenAuthz` (includes permissions).
	TokenDialect pulumi.StringPtrInput
	// Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
	TokenLifetime pulumi.IntPtrInput
	// Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
	TokenLifetimeForWeb pulumi.IntPtrInput
	// String
	VerificationLocation pulumi.StringPtrInput
}

func (ResourceServerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceServerArgs)(nil)).Elem()
}

type ResourceServerInput interface {
	pulumi.Input

	ToResourceServerOutput() ResourceServerOutput
	ToResourceServerOutputWithContext(ctx context.Context) ResourceServerOutput
}

func (ResourceServer) ElementType() reflect.Type {
	return reflect.TypeOf((*ResourceServer)(nil)).Elem()
}

func (i ResourceServer) ToResourceServerOutput() ResourceServerOutput {
	return i.ToResourceServerOutputWithContext(context.Background())
}

func (i ResourceServer) ToResourceServerOutputWithContext(ctx context.Context) ResourceServerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceServerOutput)
}

type ResourceServerOutput struct {
	*pulumi.OutputState
}

func (ResourceServerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ResourceServerOutput)(nil)).Elem()
}

func (o ResourceServerOutput) ToResourceServerOutput() ResourceServerOutput {
	return o
}

func (o ResourceServerOutput) ToResourceServerOutputWithContext(ctx context.Context) ResourceServerOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ResourceServerOutput{})
}
